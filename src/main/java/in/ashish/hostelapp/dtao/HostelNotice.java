package in.ashish.hostelapp.dtao;


import java.sql.Timestamp;

public class HostelNotice {
    private int noticeId;
    private String title;
    private String body;
    private int postedBy;
    private Timestamp postedAt;

    public HostelNotice() {}

    public HostelNotice(int noticeId, String title, String body, int postedBy, Timestamp postedAt) {
        this.noticeId = noticeId;
        this.title = title;
        this.body = body;
        this.postedBy = postedBy;
        this.postedAt = postedAt;
    }

    public int getNoticeId() { return noticeId; }
    public void setNoticeId(int noticeId) { this.noticeId = noticeId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public int getPostedBy() { return postedBy; }
    public void setPostedBy(int postedBy) { this.postedBy = postedBy; }

    public Timestamp getPostedAt() { return postedAt; }
    public void setPostedAt(Timestamp postedAt) { this.postedAt = postedAt; }

    @Override
    public String toString() {
        return "HostelNotice [noticeId=" + noticeId + ", title=" + title + ", postedBy=" + postedBy + "]";
    }
}
