package Exception;

public class ZooBooker {

    public void buyTicket(ZooBookingDto zooBookingDto)throws TicketBookingException{
        String name=zooBookingDto.getCustomerName();
        String email= zooBookingDto.getEmail();
        long number= zooBookingDto.getNumber();
        int ticket= zooBookingDto.getNumOfTicket();

        if (name.length()<=2 || String.valueOf(number).length()<10 || ticket<1){
            throw new TicketBookingException();
        }
        else {
            System.out.println("booking successfull");
        }

    }
}
