package scenario_based.EventManagement;

public class EventManagerApp {
    public static void main(String[] args) {

        EventManager manager = new EventManager();

        manager.addTicket(new Ticket("Concert A", 2500));
        manager.addTicket(new Ticket("Theatre B", 1500));
        manager.addTicket(new Ticket("Sports C", 3000));
        manager.addTicket(new Ticket("Comedy D", 1200));
        manager.addTicket(new Ticket("Concert E", 2000));

        manager.sortTicketsByPrice();
//      Top 3 cheapest
        manager.displayTopTickets(3, true);   
        System.out.println();
//      Top 2 expensive
        manager.displayTopTickets(2, false);  
    }
}
