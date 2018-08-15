package com.ehe.training.appointment.dao;

import com.ehe.training.appointment.beans.Appointment;
import com.ehe.training.appointment.dao.mappers.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentDAO {
    @Autowired
    AppointmentMapper appointmentMapper;

    public List<Appointment> getAllAppointments() {
        return appointmentMapper.getAllAppointments();
    }

    public boolean addAppointment(Appointment appointment) {
        return appointmentMapper.createAppointment(appointment);
    }
}
