package com.htc.hospitalaggregate.entity;

import java.util.List;
import java.util.Objects;

public class Hospital_Aggregate {

	public Hospital_Aggregate(long patientId, String firstName, String lastName, long mobileNumber,
			long emergencyNumber, List<Doctor> hospital) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emergencyNumber = emergencyNumber;
		this.hospital = hospital;
	}

	private long patientId;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private long emergencyNumber;
	
	private List<Doctor> hospital;

	public Hospital_Aggregate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(long emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	public List<Doctor> getHospital() {
		return hospital;
	}

	public void setHospital(List<Doctor> hospital) {
		this.hospital = hospital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (emergencyNumber ^ (emergencyNumber >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
		result = prime * result + (int) (patientId ^ (patientId >>> 32));
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
		Hospital_Aggregate other = (Hospital_Aggregate) obj;
		if (emergencyNumber != other.emergencyNumber)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNumber != other.mobileNumber)
			return false;
		if (patientId != other.patientId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hospital_Aggregate [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", emergencyNumber=" + emergencyNumber + ", hospital=" + hospital
				+ "]";
	}

	
	
}
