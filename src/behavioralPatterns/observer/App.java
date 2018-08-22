package behavioralPatterns.observer;

public class App {
    public static void main(String[] args) {
        AnnouncementMaker announcementMaker1 = new AnnouncementMaker("Boss 1");
        AnnouncementObserver announcementObserver1 = new AnnouncementObserver("Empoyee 1");
        AnnouncementObserver announcementObserver2 = new AnnouncementObserver("Empoyee 2");
        AnnouncementObserver announcementObserver3 = new AnnouncementObserver("Empoyee 3");
        AnnouncementObserver announcementObserver4 = new AnnouncementObserver("Empoyee 4");
        announcementMaker1.subscribeObserver(announcementObserver1);
        announcementMaker1.subscribeObserver(announcementObserver2);
        announcementMaker1.subscribeObserver(announcementObserver3);
        announcementMaker1.subscribeObserver(announcementObserver4);

        AnnouncementMaker announcementMaker2 = new AnnouncementMaker("Boss 2");
        announcementMaker2.subscribeObserver(announcementObserver1);
        announcementMaker2.subscribeObserver(announcementObserver4);

        announcementMaker1.setAnnouncement("Work harder!");
        announcementMaker2.setAnnouncement("Be easy");
        announcementMaker1.setAnnouncement("The weather is fine");
    }
}
