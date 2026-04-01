package class_and_object;

public class MovieTicket {
	String movieName, seatNumber;
    double price;
    boolean booked = false;

    void bookTicket(String movie, String seat, double cost) {
        if (!booked) {
            movieName = movie;
            seatNumber = seat;
            price = cost;
            booked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    void showDetails() {
        if (booked)
            System.out.println("Price: $" + price);
        else
            System.out.println("Ticket have not booked yet....");
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.showDetails();
        t.bookTicket("Dragon", "A10", 120);
        t.bookTicket("Dragon", "A10", 120);
        t.showDetails();
    }

}
