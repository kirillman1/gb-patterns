package behavioralPatterns.chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public void handle(Project project){
        if (next != null){
            next.handle(project);
        }
    }

    public Handler link (Handler next){
        this.next = next;
        return next;
    }
}
