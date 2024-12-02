import java.util.ArrayList;
import java.util.List;

public class CruiseShip {
    private String name;
    private int capacity;
    private List <Destination> itinerary;
    private List<Passenger> passengerList;

    public CruiseShip (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        itinerary = new ArrayList<Destination>();
        passengerList = new ArrayList<Passenger>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    public void removeDestination(Destination destination){
        itinerary.remove(destination);
    }

    public void addPassenger(Passenger passenger){
        passengerList.add(passenger);
    }
    public void removePassenger(Passenger passenger){
        passengerList.remove(passenger);
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setItinerary(Destination itinerary) {
        this.itinerary.add(itinerary);
    }
    public void ridItinerary(Destination itinerary) {
        for ( int i = 0; i<this.itinerary.size();i++){
            if ( this.itinerary.get(i).equals(itinerary)) {
                this.itinerary.remove(itinerary);
            }
        }

    }

    public void setPassengerList(Passenger passenger) {
        this.passengerList.add(passenger);
    }
    public void ridPassengerList(Passenger passenger) {
        for ( int i = 0; i<this.passengerList.size();i++){
            if ( this.passengerList.get(i).equals(passenger)) {
                this.passengerList.remove(passenger);
            }
        }
    }
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void printAll(){
        System.out.println("Ship name: "+ name +"\n"+ "List of Passengers: " + passengerList + "\n" + "This is the itinerary: " + itinerary + "\n");
    }

    public void printItin(){
        System.out.println("Ship name: "+ name + '\n' + "These are the destinations we will go to: " +itinerary);
        for ( int i = 0; i < itinerary.size(); i++){
            itinerary.get(i).getDetails();
        }

    }

}
