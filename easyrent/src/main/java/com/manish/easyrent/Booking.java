package com.manish.easyrent;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bookings")
@Data // Agar Lombok nahi hai toh Getters/Setters manually bana lena
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleName;
    private String vehicleType;
    private Double totalPrice;
    private String status = "Confirmed";
    private String imageUrl;
}
