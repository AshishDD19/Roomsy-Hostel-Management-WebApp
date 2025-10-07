package in.ashish.hostelapp.dtao;


public class Admin {
    private int adminId;
    private String username;
    private String password;
    private String email;
    private long phone;

    public Admin() {}

    public Admin(int adminId, String username, String password, String email, long phone) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public int getAdminId() { return adminId; }
    public void setAdminId(int adminId) { this.adminId = adminId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", username=" + username + ", email=" + email + ", phone=" + phone + "]";
    }
}
