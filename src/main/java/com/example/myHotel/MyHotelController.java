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

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewHotel (@RequestParam String name
            , @RequestParam String address) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Hotel h = new Hotel();
        h.setHotelName(name);
        h.setHotelAddress(address);
        hotelRepository.save(h);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Hotel> getAllHotels() {
        // This returns a JSON or XML with the users
        return hotelRepository.findAll();
    }
}
