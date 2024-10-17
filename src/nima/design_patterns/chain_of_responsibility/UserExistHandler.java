package nima.design_patterns.chain_of_responsibility;

public class UserExistHandler extends Handler {
    private Database database;

    public UserExistHandler(Database database) {
        this.database=database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This username is not registered");
            System.out.println("Signup this user");
            return false;
        }
        return handleNext(username, password);
    }
}
