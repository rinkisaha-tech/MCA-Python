/*Simulate an online ticket booking system using java where
multiple users try to book tickets, but there are limited number of tickets.
Also define user-defined NoTicketAvailableException */

class NoTicketAvailableException extends Exception{
    public NoTicketAvailableException(String message){
        super(message);
    }
}

class ticketBkngSys {
    private int availableTicket;
    public ticketBkngSys(int tickets){
        this.availableTicket = tickets;
    }
    public void bookTicket(String username, int reqTickets) throws NoTicketAvailableException{
        if (reqTickets <= 0){
            throw new IllegalArgumentException("Invalid number of req tickets");
        }
        if (reqTickets > availableTicket){
            throw new NoTicketAvailableException("No tickets available... "+ username);
        }
        availableTicket -= reqTickets;
        System.out.println(username + "Successfully booked " + reqTickets + " ticket .");
    }
}

class user extends Thread{
    private ticketBkngSys system;
    private String username ;
    private int ticketsNeeded;

    public user(ticketBkngSys system, String username, int ticketsNeeded){
        this.system = system;
        this.ticketsNeeded = ticketsNeeded;
        this.username = username;
    }
    public void run(){
        try{
            system.bookTicket(username, ticketsNeeded);
        }catch (NoTicketAvailableException e){
            System.out.println("Booking failed for: " + username +" "+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error for " + username + ":" + e.getMessage());
        }
    }
}

public class asst39 {

    public static void main(String[] args) {
        ticketBkngSys system = new ticketBkngSys(5);

        user u1 = new user(system, "Jibinath ", 1);
        user u2 = new user(system, "Monindranath", 3);
        user u3 = new user(system, "Kuntendranath", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}