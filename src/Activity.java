import java.util.ArrayList;
import java.util.List;

public class Activity {
   protected String name;
    protected String description;
    protected double cost;
    protected int slots;
    private List<Integer> signups;
    public Activity(String name, String description, int slots) {
        this.name = name;
        this.description = description;
        this.signups = new ArrayList<Integer>();
        this.slots = slots;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }
    public int getSlots() {
        return slots;
    }

    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public List<Integer> getSignups() {
        return signups;
    }

    public void signup(Passenger passenger){

        for ( int i = 0; i <signups.size(); i++ ){
            if (passenger.getPassengerNumber() == signups.get(i)){
                System.out.println("You are already registered in this activity");

            }
        }


        // check capacity

        //check balance
        if ( passenger.getBalance() >= cost && passenger.getHassignuped()==false && !(slots == 0)){
            if( passenger.getType().equalsIgnoreCase("regular")) {
                //changes passenger balance
                double tempNew = passenger.getBalance() - getCost();
                passenger.setBalance(tempNew);
                passenger.setHassignuped(true);
                slots -= 1;
                signups.add(passenger.getPassengerNumber());
            }
            else if(passenger.getType().equalsIgnoreCase("elderly")){
                double tempNew2 = passenger.getBalance() - (getCost() * 0.9);
                passenger.setBalance(tempNew2);
                passenger.setHassignuped(true);
                slots -= 1;
                signups.add(passenger.getPassengerNumber());
            }
        }
        else {
            System.out.println("There was an error processing you sign-up, balance insufficient, there are no more available slots or you have signed up for another activity already");
        }


    }


}
