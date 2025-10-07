package in.ashish.hostelapp.dao;

import java.util.ArrayList;

import in.ashish.hostelapp.dtao.MaintenanceRequest;

public interface MaintenanceRequestDAO {
    boolean insert(MaintenanceRequest request);
    boolean update(MaintenanceRequest request);
    boolean delete(int requestId);
    MaintenanceRequest getById(int requestId);
    ArrayList<MaintenanceRequest> getAll();
}
