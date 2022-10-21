package challenges;

import java.util.Objects;

public class User {
    private String name;
    private int ID;

    public User(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
