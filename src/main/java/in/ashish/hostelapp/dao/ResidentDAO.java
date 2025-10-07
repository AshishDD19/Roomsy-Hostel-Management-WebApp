package in.ashish.hostelapp.dao;

import java.util.ArrayList;


import in.ashish.hostelapp.dtao.Resident;

public interface ResidentDAO {
    boolean insert(Resident resident) ;
    boolean update(Resident resident);
    boolean delete(int residentId);
    Resident getResident(String email,String pass); 
    Resident getResident(long phone,String email); 
    ArrayList<Resident> getAll(String name); 
    ArrayList<Resident> getAll(); 
}
