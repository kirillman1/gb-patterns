package behavioralPatterns.chainOfResponsibility;

public class LoopHandler extends Handler {
    private Project project;

    @Override
    public void handle(Project project) {
        if (this.project == project){
            System.out.println("Все менеджеры заняты");
        } else {
            this.project = project;
        }
        super.handle(project);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
