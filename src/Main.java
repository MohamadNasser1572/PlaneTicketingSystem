import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //greetings for logging in + asking if the user is a passenger or an admin
        System.out.println("Welcome to Nasser Plane Ticketing System.\n Are you Admin/Passenger? ");
        String you = sc.nextLine();
        if (you.equalsIgnoreCase("Admin")) {
            //he can add flights
        } else if (you.equalsIgnoreCase("Passenger")) {
            //he can book flights
        }
    }
}