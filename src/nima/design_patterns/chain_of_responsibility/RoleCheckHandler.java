package nima.design_patterns.chain_of_responsibility;

public class RoleCheckHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Loading admin page...");
            return true;
        }
        System.out.println("Load default page");
        return handleNext(username, password);
    }

}
