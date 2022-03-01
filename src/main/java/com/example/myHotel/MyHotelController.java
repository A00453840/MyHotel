package com.example.myHotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyHotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/")
    public String index() {
        return "It's working!";
    }

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewHotel (@RequestParam String name, @RequestParam String address) {

        Hotel h = new Hotel();
        h.setHotelName(name);
        h.setHotelAddress(address);
        hotelRepository.save(h);
        return "New Hotel added!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
