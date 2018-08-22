package behavioralPatterns.chainOfResponsibility;

public class App {
    public static void main(String[] args) {
        Handler handler = new LoopHandler();

        handler.link(new ProjectManager("Vasya"))
                .link(new ProjectManager("Kolya"))
                .link(new ProjectManager("Petya"))
                .link(handler);

        handler.handle(new Project("Project1"));
    }
}
