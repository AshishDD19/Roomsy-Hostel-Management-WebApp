package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.Resident;

public class ResidentDAOImpl implements ResidentDAO{
	
	private Connection con;
	
	public ResidentDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public boolean insert(Resident resident) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String query = "INSERT INTO RESIDENT VALUES (0,?,?,?,?,?,?,?,SYSDATE())";
		int i = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, resident.getName());
			ps.setString(2, resident.getEmail());
			ps.setLong(3, resident.getPhone());
			ps.setString(4, resident.getGender());
			ps.setString(5, resident.getDob());
			ps.setString(6, resident.getAddress());
			ps.setString(7, resident.getPassword());
			
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
	public boolean update(Resident resident) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String query = "UPDATE RESIDENT SET NAME = ?,EMAIL = ?,PHONE = ?,GENDER = ?,DOB = ?,ADDRESS = ?, PASSWORD = ?,registration_date = SYSDATE() WHERE RESIDENT_ID = ?";
		int i = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, resident.getName());
			ps.setString(2, resident.getEmail());
			ps.setLong(3, resident.getPhone());
			ps.setString(4, resident.getGender());
			ps.setString(5, resident.getDob());
			ps.setString(6, resident.getAddress());
			ps.setString(7, resident.getPassword());
			
			ps.setInt(8, resident.getResidentId());
			
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
	public boolean delete(int residentId) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String query = "DELETE FROM RESIDENT WHERE RESIDENT_ID = ?";
		int i = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, residentId);
			
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
	public Resident getResident(String email, String pass) {
		// TODO Auto-generated method stub
		Resident r = null;
		PreparedStatement ps = null;
		String query = "SELECT * FROM RESIDENT WHERE EMAIL = ? AND PASSWORD = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				r = new Resident();
				r.setResidentId(rs.getInt("resident_id"));
				r.setName(rs.getString("name"));
				r.setEmail(rs.getString("email"));
				r.setPhone(rs.getLong("phone"));
				r.setGender(rs.getString("gender"));
				r.setDob(rs.getString("dob"));
				r.setAddress(rs.getString("address"));
				r.setPassword(rs.getString("password"));
				r.setRegistrationDate(rs.getString("registration_date"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public Resident getResident(long phone, String email) {
		// TODO Auto-generated method stub
		Resident r = null;
		PreparedStatement ps = null;
		String query = "SELECT * FROM RESIDENT WHERE EMAIL = ? AND PHONE = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setLong(2, phone);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				r = new Resident();
				r.setResidentId(rs.getInt("resident_id"));
				r.setName(rs.getString("name"));
				r.setEmail(rs.getString("email"));
				r.setPhone(rs.getLong("phone"));
				r.setGender(rs.getString("gender"));
				r.setDob(rs.getString("dob"));
				r.setAddress(rs.getString("address"));
				r.setPassword(rs.getString("password"));
				r.setRegistrationDate(rs.getString("registration_date"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public ArrayList<Resident> getAll(String name) {
		// TODO Auto-generated method stub
		ArrayList<Resident> rList = new ArrayList<Resident>();
		Resident r = null;
		PreparedStatement ps = null;
		String query = "SELECT * FROM RESIDENT WHERE NAME=?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, name);
	
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				r = new Resident();
				r.setResidentId(rs.getInt("resident_id"));
				r.setName(rs.getString("name"));
				r.setEmail(rs.getString("email"));
				r.setPhone(rs.getLong("phone"));
				r.setGender(rs.getString("gender"));
				r.setDob(rs.getString("dob"));
				r.setAddress(rs.getString("address"));
				r.setPassword(rs.getString("password"));
				r.setRegistrationDate(rs.getString("registration_date"));
				
				rList.add(r);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rList;
	}	
	
	@Override
	public ArrayList<Resident> getAll() {
		// TODO Auto-generated method stub
		ArrayList<Resident> rList = new ArrayList<Resident>();
		Resident r = null;
		PreparedStatement ps = null;
		String query = "SELECT * FROM RESIDENT";
		
		try {
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				r = new Resident();
				r.setResidentId(rs.getInt("resident_id"));
				r.setName(rs.getString("name"));
				r.setEmail(rs.getString("email"));
				r.setPhone(rs.getLong("phone"));
				r.setGender(rs.getString("gender"));
				r.setDob(rs.getString("dob"));
				r.setAddress(rs.getString("address"));
				r.setPassword(rs.getString("password"));
				r.setRegistrationDate(rs.getString("registration_date"));
				
				rList.add(r);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rList;
	}

}
