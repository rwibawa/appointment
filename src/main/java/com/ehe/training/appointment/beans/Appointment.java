package com.ehe.training.appointment.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Appointment {
    private int appointmentId;
    private String appointmentDate;
    private String appointmentFromTime;
    private String appointmentToTime;
    private String hospitalName;
    private String appointmentDescription;
}
