package com.ehe.training.appointment.api;

import com.ehe.training.appointment.beans.Appointment;
import com.ehe.training.appointment.delegates.AppointmentDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentService {
    @Autowired
    AppointmentDelegate appointmentDelegate;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentDelegate.getAllAppointments();
    }

    @PostMapping
    public boolean addAppointment(@RequestBody Appointment appointment) {
        return appointmentDelegate.addAppointment(appointment);
    }
}
