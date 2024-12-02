public class SightSeeing extends Activity {
    private int cost;

    public SightSeeing(String name, String description, int cost, int slots) {
        super(name, description, slots);
        this.cost = cost;
    }

    public String getPlaceName() {
        return name;
    }

    public void setPlaceName(String placename) {
    }


    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }


}