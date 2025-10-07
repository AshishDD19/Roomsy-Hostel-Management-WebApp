package in.ashish.hostelapp.dtao;

import java.sql.Date;

public class RoomAssignment {
    private int assignmentId;
    private int residentId;
    private int roomId;
    private Date assignedDate;
    private Date endDate;

    public RoomAssignment() {}

    public RoomAssignment(int assignmentId, int residentId, int roomId, Date assignedDate, Date endDate) {
        this.assignmentId = assignmentId;
        this.residentId = residentId;
        this.roomId = roomId;
        this.assignedDate = assignedDate;
        this.endDate = endDate;
    }

    public int getAssignmentId() { return assignmentId; }
    public void setAssignmentId(int assignmentId) { this.assignmentId = assignmentId; }

    public int getResidentId() { return residentId; }
    public void setResidentId(int residentId) { this.residentId = residentId; }

    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }

    public Date getAssignedDate() { return assignedDate; }
    public void setAssignedDate(Date assignedDate) { this.assignedDate = assignedDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "RoomAssignment [assignmentId=" + assignmentId + ", residentId=" + residentId +
               ", roomId=" + roomId + ", assignedDate=" + assignedDate + ", endDate=" + endDate + "]";
    }
}
