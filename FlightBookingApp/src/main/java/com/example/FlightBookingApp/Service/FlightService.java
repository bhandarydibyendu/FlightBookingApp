package com.example.FlightBookingApp.Service;

import com.example.FlightBookingApp.Entity.Flight;
import com.example.FlightBookingApp.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;


    public List<Flight> getAllFlightsFromSourceToDestination(String source, String destination) {
        return flightRepository.getAllFlightList().stream().filter(item -> item.getSource().equalsIgnoreCase(source)
                && item.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toList());
    }

}
