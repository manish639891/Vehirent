package com.manish.easyrent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    // Saari gaadiyon ki list lene ke liye
    @GetMapping("/all")
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Nayi gaadi add karne ke liye (Optional)
    @PostMapping("/add")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}