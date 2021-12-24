package session10;

public class User2 {

    int id;
    private String firstname;
    private String lastname;

    public User2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("User{").append("id=").append(id)
                .append(", First Name=").append(firstname)
                .append(", Last Name=").append(lastname);

        return builder.toString();
    }
}
// user.java untuk mapping xml ke java object