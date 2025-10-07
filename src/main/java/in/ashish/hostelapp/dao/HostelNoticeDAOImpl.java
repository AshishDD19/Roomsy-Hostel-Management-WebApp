package in.ashish.hostelapp.dao;

import java.sql.Connection;
import java.util.ArrayList;

import in.ashish.hostelapp.connection.Connector;
import in.ashish.hostelapp.dtao.HostelNotice;

public class HostelNoticeDAOImpl implements HostelNoticeDAO{
	
	private Connection con;
	
	public HostelNoticeDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public boolean insert(HostelNotice notice) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(HostelNotice notice) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int noticeId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HostelNotice getById(int noticeId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HostelNotice> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
