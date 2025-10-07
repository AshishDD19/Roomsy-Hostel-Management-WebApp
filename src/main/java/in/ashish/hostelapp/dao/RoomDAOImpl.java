package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.Room;

public class RoomDAOImpl implements RoomDAO {
	private Connection con;
	
	public RoomDAOImpl() {
		this.con = Connector.requestConnection();
	}
	
	@Override
	public boolean insert(Room room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Room room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room getById(int roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Room> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
