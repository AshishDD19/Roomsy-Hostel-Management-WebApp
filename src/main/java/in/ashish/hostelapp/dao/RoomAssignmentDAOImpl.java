package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.RoomAssignment;

public class RoomAssignmentDAOImpl implements RoomAssignmentDAO {
	private Connection con;
	
	public RoomAssignmentDAOImpl() {

		this.con = Connector.requestConnection();
	}
	
	@Override
	public boolean insert(RoomAssignment assignment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(RoomAssignment assignment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int assignmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RoomAssignment getById(int assignmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<RoomAssignment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
