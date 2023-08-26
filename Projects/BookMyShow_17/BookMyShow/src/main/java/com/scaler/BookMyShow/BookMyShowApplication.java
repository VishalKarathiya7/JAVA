package com.scaler.BookMyShow;

import com.scaler.BookMyShow.controllers.BookingController;
import com.scaler.BookMyShow.dtos.BookMovieRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	private BookingController bookingController;

	@Override
	public void run(String... args) throws Exception {
		BookMovieRequestDto request = new BookMovieRequestDto();
		request.setShowId(255L);
		request.setUserId(3555L);
		List<Long> seatList = new ArrayList<>();
		seatList.add(1L);
		seatList.add(3L);
		seatList.add(2L);
		request.setShowSeatIds(seatList);
		bookingController.bookMovie(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

}
