package messenger;

public class User {
    String name;
    String id;

    public User(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
