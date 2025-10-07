package in.ashish.hostelapp.dtao;

import java.sql.Date;

public class LeaveRequest {
    private int leaveId;
    private int residentId;
    private Date startDate;
    private Date endDate;
    private String status;
    private String reason;

    public LeaveRequest() {}

    public LeaveRequest(int leaveId, int residentId, Date startDate, Date endDate, String status, String reason) {
        this.leaveId = leaveId;
        this.residentId = residentId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.reason = reason;
    }

    public int getLeaveId() { return leaveId; }
    public void setLeaveId(int leaveId) { this.leaveId = leaveId; }

    public int getResidentId() { return residentId; }
    public void setResidentId(int residentId) { this.residentId = residentId; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    @Override
    public String toString() {
        return "LeaveRequest [leaveId=" + leaveId + ", residentId=" + residentId +
               ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + "]";
    }
}
