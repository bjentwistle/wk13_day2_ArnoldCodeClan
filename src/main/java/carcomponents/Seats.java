package carcomponents;

public class Seats {

    String colour;
    String numberOfSeats;
    public Seats(String colour, String numberOfSeats){
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
    }
    public String getColour(){
        return colour;
    }
    public String getSeatNumber() {
        return numberOfSeats;
    }
}
