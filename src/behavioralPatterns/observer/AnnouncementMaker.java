package behavioralPatterns.observer;

public class AnnouncementMaker extends Subject {
    private String name;
    private String announcement;

    public AnnouncementMaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
        informObservers(announcement);
    }
}
