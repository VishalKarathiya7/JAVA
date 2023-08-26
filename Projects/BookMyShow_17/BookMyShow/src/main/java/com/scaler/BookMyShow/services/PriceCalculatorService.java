package com.scaler.BookMyShow.services;

import com.scaler.BookMyShow.models.Show;
import com.scaler.BookMyShow.models.ShowSeat;
import com.scaler.BookMyShow.models.ShowSeatType;
import com.scaler.BookMyShow.repositories.ShowRepository;
import com.scaler.BookMyShow.repositories.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceCalculatorService {
    private ShowSeatRepository showSeatRepository;
    public int calculatePrice(List<ShowSeat> showSeats, Show show){
        List<ShowSeatType> showSeatTypes = showSeatRepository.findAllByShow(show);

        int amount = 0;
        for(ShowSeat showSeat:showSeats){
            for( ShowSeatType showSeatType:showSeatTypes){
                if(showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())){
                   amount += showSeatType.getPrice();
                   break;
                }
            }
        }
        return amount;
    }
}
