package in.ashish.hostelapp.dao;

import java.util.ArrayList;

import in.ashish.hostelapp.dtao.LeaveRequest;

public interface LeaveRequestDAO {
	boolean insert(LeaveRequest leaveRequest);
    boolean update(LeaveRequest leaveRequest);
    boolean delete(int leaveId);
    LeaveRequest getById(int leaveId);
    ArrayList<LeaveRequest> getAll();
}
