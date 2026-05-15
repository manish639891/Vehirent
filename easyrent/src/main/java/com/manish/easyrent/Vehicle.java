package com.manish.easyrent; // Apna package name check kar lena

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles") // Database mein table ka naam 'vehicles' hoga
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID ke liye
    private Long id;

    @Column(nullable = false) // Name khali nahi hona chahiye
    private String name;

    private String type;

    @Column(name = "price_per_day") // DB mein column ka naam underscore ke saath hoga
    private double pricePerDay;

    private String status;

    @Column(name = "image_url", length = 500) // URL lamba ho sakta hai isliye length badha di
    private String imageUrl;

    // 1. Default Constructor (Hibernate ke liye bahut zaruri hai)
    public Vehicle() {
    }

    // 2. Parameterized Constructor (Data asani se add karne ke liye)
    public Vehicle(String name, String type, double pricePerDay, String status, String imageUrl) {
        this.name = name;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.status = status;
        this.imageUrl = imageUrl;
    }

    // 3. Getters aur Setters (Inhi se Android data nikalega)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}