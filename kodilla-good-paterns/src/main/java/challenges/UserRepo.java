package challenges;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    private final Map<User, Integer> users = new HashMap<>();
    private int id = 1;

    public void createUser(String userName) {
        users.put(new User(userName), id);
        id++;
    }

    boolean ifUserExist(User user) {
        return users.containsKey(user);
    }
}
