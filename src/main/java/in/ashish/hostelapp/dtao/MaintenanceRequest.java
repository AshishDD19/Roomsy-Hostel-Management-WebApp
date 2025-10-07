package in.ashish.hostelapp.dtao;



import java.sql.Timestamp;

public class MaintenanceRequest {
    private int requestId;
    private int residentId;
    private Integer roomId; // Nullable
    private String subject;
    private String description;
    private String status;
    private Timestamp createdAt;
    private Timestamp resolvedAt;

    public MaintenanceRequest() {}

    public MaintenanceRequest(int requestId, int residentId, Integer roomId, String subject,
                               String description, String status, Timestamp createdAt, Timestamp resolvedAt) {
        this.requestId = requestId;
        this.residentId = residentId;
        this.roomId = roomId;
        this.subject = subject;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.resolvedAt = resolvedAt;
    }

    public int getRequestId() { return requestId; }
    public void setRequestId(int requestId) { this.requestId = requestId; }

    public int getResidentId() { return residentId; }
    public void setResidentId(int residentId) { this.residentId = residentId; }

    public Integer getRoomId() { return roomId; }
    public void setRoomId(Integer roomId) { this.roomId = roomId; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public Timestamp getResolvedAt() { return resolvedAt; }
    public void setResolvedAt(Timestamp resolvedAt) { this.resolvedAt = resolvedAt; }

    @Override
    public String toString() {
        return "MaintenanceRequest [requestId=" + requestId + ", residentId=" + residentId +
               ", roomId=" + roomId + ", subject=" + subject + ", status=" + status + "]";
    }
}
