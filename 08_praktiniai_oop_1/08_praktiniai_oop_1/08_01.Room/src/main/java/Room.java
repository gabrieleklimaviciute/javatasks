public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public int getSeats(){
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
