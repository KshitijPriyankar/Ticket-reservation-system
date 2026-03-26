package com.ticket.database;

import com.ticket.model.Train;
import java.util.*;

public class RailwayDatabase {
    private List<Train> trains = new ArrayList<>();

    public RailwayDatabase() {
        trains.add(new Train(12591, "Mumbai", "Delhi", 5));
        trains.add(new Train(22119, "Pune", "Goa", 3));
    }

    public List<Train> getTrains() {
        return trains;
    }

    public Train findTrain(int trainNumber) {
        for (Train t : trains) {
            if (t.getTrainNumber() == trainNumber)
                return t;
        }
        return null;
    }
}