package nima.design_patterns.chain_of_responsibility;

public class Main2 {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.logIn("Username", "password");
    }
}
