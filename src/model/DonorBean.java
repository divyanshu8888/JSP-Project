package model;

public class DonorBean {
	String DonorID ;
	String name;
	String  DOB; 	
	String Address; 	
	String Phone;
	String Gender;
	String BloodGroup;
	
	public DonorBean(String donorID, String name, String dOB, String address, String phone, String gender,String bloodGroup) {
		super();
		DonorID = donorID;
		this.name = name;
		DOB = dOB;
		Address = address;
		Phone = phone;
		Gender = gender;
		BloodGroup = bloodGroup;
	}

	public String getDonorID() {
		return DonorID;
	}

	public void setDonorID(String donorID) {
		DonorID = donorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	
	
	
}
