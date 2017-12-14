package com.mkshkmrgpt.directflightconnectionservice.info;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import java.time.Instant;

public class DirectFlightConnection {

    @Id
    private final String id;
    @CreatedDate
    private final Instant instantOfCreation;
    private final String airline;
    private final String departureAirport;
    private final String arrivalAirport;
    private final Instant departureTime;
    private final Instant arrivalTime;

    public DirectFlightConnection() {
        this.id = null;
        instantOfCreation = null;
        airline = null;
        departureAirport = null;
        arrivalAirport = null;
        departureTime = null;
        arrivalTime = null;
    }

    public DirectFlightConnection(String airline, String departureAirport, String arrivalAirport, Instant departureTime, Instant arrivalTime) {
        super();
        this.id = null;
        this.instantOfCreation = null;
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}
