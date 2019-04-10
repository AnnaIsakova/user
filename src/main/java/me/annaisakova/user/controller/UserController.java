package me.annaisakova.user.controller;


import lombok.RequiredArgsConstructor;
import me.annaisakova.user.client.BookingClient;
import me.annaisakova.user.model.Booking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class UserController {

    private final BookingClient bookingClient;

    @GetMapping("/users/{userId}/booking")
    public List<Booking> getBookings(@PathVariable Long userId) {
        return bookingClient.getBookings(userId);
    }
}
