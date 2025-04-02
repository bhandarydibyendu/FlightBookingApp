package com.example.FlightBookingApp.Repository;

import com.example.FlightBookingApp.Database.FlightList;
import com.example.FlightBookingApp.Entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightRepository {
    @Autowired
    FlightList flightList;

    public List<Flight> getAllFlightList(){
        return flightList.getAllFlights();
    }
}
