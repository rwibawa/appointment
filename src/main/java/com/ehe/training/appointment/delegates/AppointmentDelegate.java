package com.ehe.training.appointment.delegates;

import com.ehe.training.appointment.beans.Appointment;
import com.ehe.training.appointment.dao.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentDelegate {

//    List<Appointment> appointments = new ArrayList<>();
    @Autowired
    AppointmentDAO appointmentDAO;

    public List<Appointment> getAllAppointments() {
        return appointmentDAO.getAllAppointments();
    }

    public boolean addAppointment(Appointment appointment) {
        return appointmentDAO.addAppointment(appointment);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
