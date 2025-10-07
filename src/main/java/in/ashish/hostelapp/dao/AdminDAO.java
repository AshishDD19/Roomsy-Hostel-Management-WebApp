package in.ashish.hostelapp.dao;

import java.util.ArrayList;

import in.ashish.hostelapp.dtao.Admin;

public interface AdminDAO {
    boolean insert(Admin admin); 
    boolean update(Admin admin); 
    boolean delete(int adminId); 
    Admin getAdmin(String email,String pass); 
    Admin getAdmin(long phone,String email); 
    ArrayList<Admin> getAll(String username); 
    ArrayList<Admin> getAll(); 
}
