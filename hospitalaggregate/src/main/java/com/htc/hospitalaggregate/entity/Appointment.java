package com.htc.hospitalaggregate.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment {

	private long appointmentId;
	private LocalDate appointmentDate;
	private long doctorId;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(long appointmentId, LocalDate appointmentDate, long doctorId) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDate=" + appointmentDate + ", doctorId="
				+ doctorId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
		result = prime * result + (int) (appointmentId ^ (appointmentId >>> 32));
		result = prime * result + (int) (doctorId ^ (doctorId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (appointmentDate == null) {
			if (other.appointmentDate != null)
				return false;
		} else if (!appointmentDate.equals(other.appointmentDate))
			return false;
		if (appointmentId != other.appointmentId)
			return false;
		if (doctorId != other.doctorId)
			return false;
		return true;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	
}
