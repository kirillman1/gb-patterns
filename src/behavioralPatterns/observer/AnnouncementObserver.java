package behavioralPatterns.observer;

public class AnnouncementObserver implements Observer {
    private String name;

    @Override
    public void update(Subject subject, Object arg) {
        System.out.printf("%s получил объявление от %s: %s" + System.lineSeparator(), name, subject.getName(), arg);
    }

    public AnnouncementObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
