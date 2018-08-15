package com.ehe.training.appointment.dao.mappers;

import com.ehe.training.appointment.beans.Appointment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AppointmentMapper {
    @Select("select * from appointment")
    List<Appointment> getAllAppointments();

    @Insert("INSERT INTO appointment(appointment_id, appointment_date, appointment_description, hospital_name, appointment_from_time, appointment_to_time) VALUES (#{appointmentId}, #{appointmentDate}, #{appointmentDescription}, #{hospitalName}, #{appointmentFromTime}, #{appointmentToTime})")
    boolean createAppointment(Appointment appointment);
}
