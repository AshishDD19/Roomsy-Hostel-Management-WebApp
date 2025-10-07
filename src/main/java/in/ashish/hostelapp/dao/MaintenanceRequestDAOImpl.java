package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.MaintenanceRequest;

public class MaintenanceRequestDAOImpl implements MaintenanceRequestDAO{

	private Connection con;
	
	public MaintenanceRequestDAOImpl() {
		this.con = Connector.requestConnection();
	}
	
	@Override
	public boolean insert(MaintenanceRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MaintenanceRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int requestId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MaintenanceRequest getById(int requestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MaintenanceRequest> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
