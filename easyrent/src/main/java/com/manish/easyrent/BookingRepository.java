package com.manish.easyrent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Bas itna hi! SQL queries Spring apne aap likh lega.
}
