package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserRepo {

    private Random random = new Random();
    private List<User> userList = new ArrayList<>();

    void createUser(String userName) {
        for (User u : userList) {
            if (u.getName().equals(userName)) {
                System.out.println("Invalid username");
                break;
            } else {
                int id = random.nextInt();
                if (u.getID() != id) {
                    userList.add(new User(userName, id));
                }
            }
        }
    }

    boolean isUserExist(User user) {
        boolean userNameExist = false;
        boolean userIdExist = false;
        for (User u : userList) {
            if (u.getName().equals(user.getName())) {
                userNameExist = true;
            }
        }
        for (User u : userList) {
            if (u.getID() == user.getID()) {
                userNameExist = true;
            }
        }
        if (userIdExist && userNameExist) {
            return true;
        } else {
            return false;
        }
    }
}
