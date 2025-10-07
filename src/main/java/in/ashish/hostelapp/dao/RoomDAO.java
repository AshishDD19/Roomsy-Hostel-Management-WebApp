package in.ashish.hostelapp.dao;

import java.util.ArrayList;

import in.ashish.hostelapp.dtao.Room;

public interface RoomDAO {
    boolean insert(Room room);
    boolean update(Room room);
    boolean delete(int roomId);
    Room getById(int roomId);
    ArrayList<Room> getAll();
}
