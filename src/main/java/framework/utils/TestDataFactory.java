package framework.utils;

public class TestDataFactory extends Dictionary{

    public void createUsersCredentialsToLogin(String username) {
        if (username == getClientUsername()) {
            setUsername(getClientUsername());
            setPassword(getClientPassword());
        }
    }

    public String clientUsername() {
        return getUsername();
    }

    public String clientPassword() {
        return getPassword();
    }
    public String clientFirstName() {
        return getClientFirstName();
    }

}
