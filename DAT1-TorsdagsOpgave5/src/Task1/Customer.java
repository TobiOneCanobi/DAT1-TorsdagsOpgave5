package Task1;

public class Customer
{
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String lastName, String userName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String toString()
    {
        return firstName + lastName + userName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getUsername()
    {
        return this.userName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
