package challenges;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> userList = new ArrayList<>();
    private int id = 1;

    void createUser(String userName) {
        userList.add(new User(userName, id));
        id++;
    }

    boolean ifUserExist(User user) {
        for (User u : userList) {
            if (!user.equals(u)) {
                return true;
            }
        }
        return false;
    }
}
