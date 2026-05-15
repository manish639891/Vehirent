package com.manish.easyrent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    // 1. Booking Save karne ke liye
    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    // 2. "My Bookings" section ke liye saari bookings dikhana
    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
