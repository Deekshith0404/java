package Exception;

public class ZooBookingDto {
    private String customerName;
    private String email;
    private long number;
    private int numOfTicket;

    public ZooBookingDto(String customerName, String email, long number) {
        this.customerName = customerName;
        this.email = email;
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getNumber() {
        return number;
    }

    public int getNumOfTicket() {
        return numOfTicket;
    }

    public void setNumOfTicket(int numOfTicket) {
        this.numOfTicket = numOfTicket;
    }
}
