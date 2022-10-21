package challenges;

import java.util.Objects;

public class User {
    private final String name;
    private final int id;

    public User(String name, int ID) {
        this.name = name;
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
