package com.manish.easyrent;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bookings")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String vehicleName;
    private String vehicleType;
    private Double totalPrice;
    private String status = "Confirmed";
    private String imageUrl;
}
