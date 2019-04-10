package me.annaisakova.user.client;


import me.annaisakova.user.model.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("bookingservice")
public interface BookingClient {

    @RequestMapping(
            method= RequestMethod.GET,
            value="/v1/bookings/{userId}",
            consumes="application/json")
    List<Booking> getBookings(@PathVariable("userId") Long userId);
}
