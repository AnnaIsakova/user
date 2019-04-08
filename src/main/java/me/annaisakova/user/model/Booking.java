package me.annaisakova.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class Booking {

    private String roomId;
    private Date bookedFrom;
    private Date bookedTo;
    private Long userId;
    private String comment;
}
