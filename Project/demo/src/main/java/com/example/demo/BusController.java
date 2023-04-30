package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class BusController {
    @FXML
    private Label busIdLabel;
    @FXML
    private Label scheduleLabel;
    @FXML
    private Label routeLabel;
    @FXML
    private TextField newScheduleField;
    @FXML
    private TextField newRouteField;

    private Map<String, String> busSchedules = new HashMap<>();
    private Map<String, String> busRoutes = new HashMap<>();

    public void initialize() {
        // initialize bus schedules and routes
        busSchedules.put("BUS001", "7.30 am");
        busSchedules.put("BUS002", "8.30 am");
        busSchedules.put("BUS003", "9.30 am");

        busRoutes.put("BUS001", "Mohammadpur");
        busRoutes.put("BUS002", "Dhanmondi");
        busRoutes.put("BUS003", "Curzon");

        // set default values for labels
        busIdLabel.setText("BUS001");
        scheduleLabel.setText(busSchedules.get("BUS001"));
        routeLabel.setText(busRoutes.get("BUS001"));
    }

    public void editSchedule() {
        String busId = busIdLabel.getText();
        String newSchedule = newScheduleField.getText();
        busSchedules.put(busId, newSchedule);
        scheduleLabel.setText(busSchedules.get(busId));
        newScheduleField.clear(); // clear the text field after updating schedule
    }

    public void editRoute() {
        String busId = busIdLabel.getText();
        String newRoute = newRouteField.getText();
        busRoutes.put(busId, newRoute);
        routeLabel.setText(busRoutes.get(busId));
        newRouteField.clear(); // clear the text field after updating route
    }

    public void setBusId(String busId) {
        busIdLabel.setText(busId);
        scheduleLabel.setText(busSchedules.get(busId));
        routeLabel.setText(busRoutes.get(busId));
    }
}
