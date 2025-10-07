package in.ashish.hostelapp.dao;

import java.util.ArrayList;

import in.ashish.hostelapp.dtao.RoomAssignment;

public interface RoomAssignmentDAO {
    boolean insert(RoomAssignment assignment);
    boolean update(RoomAssignment assignment);
    boolean delete(int assignmentId);
    RoomAssignment getById(int assignmentId);
    ArrayList<RoomAssignment> getAll();
}
