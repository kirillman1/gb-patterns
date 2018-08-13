package structuralPatterns.proxy;

public class DocumentProxy implements Document {
    private static final int MAX_USERS_ALLOWED = 1;

    private int numberOfUsers;

    private Document document;

    public DocumentProxy(Document document) {
        this.document = document;
    }


    @Override
    public void enter(User user) {
        if (numberOfUsers < MAX_USERS_ALLOWED){
            document.enter(user);
            numberOfUsers++;
        } else {
            System.out.println("Занято");
        }
    }
}
