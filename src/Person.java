import java.util.Queue;

public class Person {
    protected String name;
    protected String surname;
    protected int amountTickets;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAmountTickets() {
        return amountTickets;
    }

    public void setAmountTickets(int amountTickets) {
        this.amountTickets = amountTickets;
    }

    public Person (String name, String surname, int amountTickets) {
        this.name = name;
        this.surname = surname;
        this.amountTickets = amountTickets;



    }
}
