import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> someClients = generateClients();
        Queue<Person> attractionQueue = new LinkedList<>(someClients);

        while (!attractionQueue.isEmpty()) {
            Person person = attractionQueue.poll();

            int amountTickets = person.getAmountTickets();
            amountTickets -= 1;
            person.setAmountTickets(amountTickets);

            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе. Билетов осталось: " + amountTickets);

            if (amountTickets > 0) {
                attractionQueue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {

        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Ivan", "Ivanov", 3));
        clients.add(new Person("Aleksei", "Alekseev", 5));
        clients.add(new Person("Bogdan", "Bogdanovsky", 7));
        clients.add(new Person("Alisa", "Alistova", 2));
        clients.add(new Person("Marina", "Marinko", 10));
        return clients;
    }
}

