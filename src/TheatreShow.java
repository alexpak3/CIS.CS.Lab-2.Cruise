import java.util.ArrayList;
import java.util.List;

public class TheatreShow extends Activity{
    private List<Actor> cast;
    public TheatreShow(String name, String description, int slots, int cost){
        super (name, description, slots);
        cast = new ArrayList<Actor>() ;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCast(Actor actor) {
        this.cast.add(actor);
    }

    public List<Actor> getCast() {
        return cast;
    }

    private String setDescription(){
        return description = "This is a theatre show showing Wiked";
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public int getSlots() {
        return slots;
    }

    public void passengerDiscount(Passenger passenger) {
        if (passenger.getType().equalsIgnoreCase("premium")) {
            cost = 0;
        }
        else if (passenger.getType().equalsIgnoreCase("elderly")){
            cost *=0.9;
        }
    }

    @Override
    public String toString(){
        return "the cast is: "+ cast.toString();

    }
}
