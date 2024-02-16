package com.anarghyacomm.hsms.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getBookingReference() {
		return bookingReference;
	}
	public void setBookingReference(int bookingReference) {
		this.bookingReference = bookingReference;
	}
	public void setPatientId(int randomPatientId) {
		this.patientId = (int) randomPatientId;
	}
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reportId;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingReference;
	private String patientName;
	private String phoneNumber;
	private String address;
	private String age;
	private String gender;
	private String email;
	private String bloodGroup;
	private String aadhar;
	private String emergencyContact;
	private String diabetic;
	private String bp;
	private String thyroid;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId1(int randomPatientId) {
		this.patientId = randomPatientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getDiabetic() {
		return diabetic;
	}
	public void setDiabetic(String diabetic) {
		this.diabetic = diabetic;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getThyroid() {
		return thyroid;
	}
	public void setThyroid(String thyroid) {
		this.thyroid = thyroid;
	}
	public static void setFailedLoginAttempts(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
