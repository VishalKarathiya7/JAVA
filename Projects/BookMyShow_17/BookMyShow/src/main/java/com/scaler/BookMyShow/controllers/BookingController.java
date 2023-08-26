package com.scaler.BookMyShow.controllers;

import com.scaler.BookMyShow.dtos.BookMovieRequestDto;
import com.scaler.BookMyShow.dtos.BookMovieResponseDto;
import com.scaler.BookMyShow.dtos.ResponseStatus;
import com.scaler.BookMyShow.models.Booking;
import com.scaler.BookMyShow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto request){
        BookMovieResponseDto bookMovieResponseDto = new BookMovieResponseDto();

        Booking booking;
        try{
            booking = bookingService.bookMovie(
                    request.getUserId(),
                    request.getShowSeatIds(),
                    request.getShowId());
            bookMovieResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            bookMovieResponseDto.setBookingId(booking.getId());
            bookMovieResponseDto.setAmount(booking.getAmount());

        }catch (Exception e){
            bookMovieResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return bookMovieResponseDto;
    }
}
