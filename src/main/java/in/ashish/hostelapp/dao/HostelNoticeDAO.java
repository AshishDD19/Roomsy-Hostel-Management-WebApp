package in.ashish.hostelapp.dao;

import java.util.ArrayList;

import in.ashish.hostelapp.dtao.HostelNotice;

public interface HostelNoticeDAO {
    boolean insert(HostelNotice notice) throws Exception;
    boolean update(HostelNotice notice) throws Exception;
    boolean delete(int noticeId) throws Exception;
    HostelNotice getById(int noticeId) throws Exception;
    ArrayList<HostelNotice> getAll() throws Exception;
}
