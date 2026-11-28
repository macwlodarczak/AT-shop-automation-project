package framework.utils;

public class Dictionary {
    private String username;
    private String password;

    private static final String clientUsername = "client";
    private static final String clientPassword = "client";
    private static final String clientFirstName = "Alice";

    protected String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getClientPassword() {
        return clientPassword;
    }

    public static String getClientUsername() {
        return clientUsername;
    }

    public static String getClientFirstName() {
        return clientFirstName;
    }
}
