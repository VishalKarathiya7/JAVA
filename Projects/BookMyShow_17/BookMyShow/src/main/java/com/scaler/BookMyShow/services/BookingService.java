package com.scaler.BookMyShow.services;

import com.scaler.BookMyShow.models.*;
import com.scaler.BookMyShow.repositories.BookingRepository;
import com.scaler.BookMyShow.repositories.ShowRepository;
import com.scaler.BookMyShow.repositories.ShowSeatRepository;
import com.scaler.BookMyShow.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.awt.print.Book;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private PriceCalculatorService priceCalculatorService;
    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(UserRepository userRepository,
                          ShowRepository showRepository,
                          ShowSeatRepository showSeatRepository,
                          PriceCalculatorService priceCalculatorService,
                          BookingRepository bookingRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.priceCalculatorService = priceCalculatorService;
        this.bookingRepository = bookingRepository;
    }

    //    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId, List<Long> seatIds, Long showId){

        //1. Get the user with user Id.
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new RuntimeException();
        }
        User bookedBy = userOptional.get();


        //2. Get the show with Show Id.
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()){
            throw new RuntimeException();
        }
        Show bookedShow = showOptional.get();


        //-------- Start Transaction-----


        //3. Get the status with the seat Id.
        List<ShowSeat> showSeats = showSeatRepository.findAllById(seatIds);


        //4. Check if seats are available.
        for(ShowSeat showSeat: showSeats){
            if((!(showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)) ||
                    (showSeat.getShowSeatStatus().equals(ShowSeatStatus.BOOKED))) &&
                    (Duration.between(showSeat.getBlockedAt().toInstant(), new Date().toInstant()).toMinutes() > 15)){
                throw new RuntimeException();
            }
        }
        //5. If no, return Error.
        //6. If available mark the status of seat as locked.
        List<ShowSeat> savedShowSeat = new ArrayList<>();
        for(ShowSeat showSeat: showSeats){
            showSeat.setShowSeatStatus(ShowSeatStatus.BOOKED);
            savedShowSeat.add(showSeatRepository.save(showSeat));

        }
        //7. Save the updated seat status in the DB.
        //--------- End of Transaction------
        //8. Create corresponding booking object
        Booking booking = new Booking();
        booking.setBookingStatus(BookingStatus.PENDINBG);
        booking.setShowSeats(savedShowSeat);
        booking.setUser(bookedBy);
        booking.setBookedAt(new Date());
        booking.setShow(bookedShow);
        booking.setAmount(priceCalculatorService.calculatePrice(savedShowSeat,bookedShow));
        bookingRepository.save(booking);
        return booking;
    }
}
