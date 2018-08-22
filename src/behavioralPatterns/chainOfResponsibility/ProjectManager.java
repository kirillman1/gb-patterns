package behavioralPatterns.chainOfResponsibility;

public class ProjectManager extends Handler {

    private String name;

    @Override
    public void handle(Project project) {
        if (isBusy()){
            System.out.printf("%s занят" + System.lineSeparator(), name);
            super.handle(project);
        } else {
            System.out.printf("%s взял %s" + System.lineSeparator(),name,project.getName());
        }


    }

    public ProjectManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isBusy(){
        return Math.random() < 0.7;
    }
}
