package com.scaler.BookMyShow.repositories;

import com.scaler.BookMyShow.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    @Override
    Optional<Booking> findById(Long aLong);

    Booking save(Booking entity);
}
