package com.scaler.BookMyShow.repositories;

import com.scaler.BookMyShow.models.Show;
import com.scaler.BookMyShow.models.ShowSeat;
import com.scaler.BookMyShow.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    @Override
    List<ShowSeat> findAllById(Iterable<Long> longs);

    ShowSeat save(ShowSeat entity);

    List<ShowSeatType> findAllByShow(Show show);
}
