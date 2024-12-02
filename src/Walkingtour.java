public class Walkingtour extends Activity{
    private int distance;
    private double cost;


    public Walkingtour(int distance, int slots, String name, String description, double cost) {
        super(name, description, slots);
        this.distance =  distance;
        this.cost=cost;

    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    public double getCost(){
        return cost;
    }
}
