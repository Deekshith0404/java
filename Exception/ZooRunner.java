package Exception;

public class ZooRunner {
    public static void main(String[] args){
        ZooBookingDto zooBookingDto=new ZooBookingDto("raman","raman123@gmail.com",4589745685l);
        zooBookingDto.setNumOfTicket(5);
        ZooBooker zooBooker=new ZooBooker();


        try {
            zooBooker.buyTicket(zooBookingDto);
        } catch (TicketBookingException e) {
            System.err.println("error");
        }


    }
}
