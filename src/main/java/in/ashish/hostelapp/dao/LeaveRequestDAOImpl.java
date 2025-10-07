package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.LeaveRequest;

public class LeaveRequestDAOImpl implements LeaveRequestDAO{
	
	private Connection con;
	
	public LeaveRequestDAOImpl() {

		this.con = Connector.requestConnection();
	}

	@Override
	public boolean insert(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int leaveId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LeaveRequest getById(int leaveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LeaveRequest> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
