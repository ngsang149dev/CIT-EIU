package CSE203.lab2.EIULibrary;

public class User {
    private String id;
    private String name;
    private String email;
    
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(User user) {
        if (user == null) return false;
        return  (this.id.equals(user.id) && this.name.equals(user.name) && this.email.equals(user.email));
    }
    
}
