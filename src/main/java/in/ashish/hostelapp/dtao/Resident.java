package in.ashish.hostelapp.dtao;


public class Resident {
    private int residentId;
    private String name;
    private String email;
    private long phone;
    private String gender;
    private String dob;
    private String address;
    private String password;
    private String registrationDate;

    public Resident() {}

 

    public int getResidentId() {
		return residentId;
	}



	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRegistrationDate() {
		return registrationDate;
	}



	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}



	@Override
    public String toString() {
        return "Resident [residentId=" + residentId + ", name=" + name + ", email=" + email +
               ", phone=" + phone + ", gender=" + gender + ", dob=" + dob + ", address=" + address + "]";
    }
}
