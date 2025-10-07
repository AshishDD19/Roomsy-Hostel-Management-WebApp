package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.Admin;

public class AdminDAOImpl implements AdminDAO{
	
	private Connection con;
	
	public AdminDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public boolean insert(Admin admin) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String query = "INSERT INTO ADMIN VALUES (0,?,?,?,?)";
		int i = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			ps.setString(3, admin.getEmail());
			ps.setLong(4, admin.getPhone());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean update(Admin admin) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String query = "UPDATE ADMIN SET USERNAME = ? , PASSWORD = ? , EMAIL = ?, PHONE = ? WHERE ADMIN_ID = ? ";
		int i = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			ps.setString(3, admin.getEmail());
			ps.setLong(4, admin.getPhone());
			
			ps.setInt(5, admin.getAdminId());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean delete(int adminId) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String query = "DELETE FROM ADMIN WHERE ADMIN_ID = ?";
		int i = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, adminId);
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Admin  getAdmin(String mail,String pass){
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Admin a = null;
		String query = "SELECT * FROM ADMIN WHERE EMAIL = ? AND PASSWORD = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, mail);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				a = new Admin();
				a.setAdminId(rs.getInt("admin_id"));
				a.setUsername(rs.getString("username"));
				a.setPassword(rs.getString("password"));
				a.setEmail(rs.getString("email"));
				a.setPhone(rs.getLong("phone"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	@Override
	public Admin getAdmin(long phone, String email) {
		// TODO Auto-generated method stub
		Admin a = null;
		PreparedStatement ps = null;
		String query = "SELECT * FROM ADMIN WHERE EMAIL = ? AND PHONE = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setLong(2, phone);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				a = new Admin();
				a.setAdminId(rs.getInt("admin_id"));
				a.setUsername(rs.getString("username"));
				a.setPassword(rs.getString("password"));
				a.setEmail(rs.getString("email"));
				a.setPhone(rs.getLong("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	@Override
	public ArrayList<Admin> getAll() {
		// TODO Auto-generated method stub
		Admin a = null;
		ArrayList<Admin> aList = new ArrayList<Admin>();
		PreparedStatement ps = null;
		String query = "SELECT * FROM ADMIN";
		try {
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				a = new Admin();
				a.setAdminId(rs.getInt("admin_id"));
				a.setUsername(rs.getString("username"));
				a.setPassword(rs.getString("password"));
				a.setEmail(rs.getString("email"));
				a.setPhone(rs.getLong("phone"));
				
				aList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aList;
	}



	@Override
	public ArrayList<Admin> getAll(String username) {
		// TODO Auto-generated method stub
		Admin a = null;
		ArrayList<Admin> aList = new ArrayList<Admin>();
		PreparedStatement ps = null;
		String query = "SELECT * FROM ADMIN WHERE USERNAME = ?";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				a = new Admin();
				a.setAdminId(rs.getInt("admin_id"));
				a.setUsername(rs.getString("username"));
				a.setPassword(rs.getString("password"));
				a.setEmail(rs.getString("email"));
				a.setPhone(rs.getLong("phone"));
				
				aList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aList;
	}

}
