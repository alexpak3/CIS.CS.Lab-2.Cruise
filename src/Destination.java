import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        activities = new ArrayList<Activity>();

    }

    public void setName(String name) {
        this.name = name;
    }


    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }


    public void addActivities(Activity activities) {
        this.activities.add(activities);
    }

    public void ridActivities(Activity activities) {
        for (int i = 0; i < this.activities.size(); i++) {
            if (this.activities.get(i).equals(activities)) {
                this.activities.remove(activities);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void availableActivities() {
        for (Activity activity : activities) {
            System.out.println(activity + ",");
        }
    }

    public void getInfo(String name) {
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).equals(name)) {
                System.out.println(activities.get(i).getDescription());
            } else
                System.out.println("There was an error searching for this activity, please check if this is an available activity at this location");
        }
    }

    public void getDetails() {
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).equals(name)) {
                System.out.println( "Activity Name: " +activities.get(i).getName() + '\n' + "Activity Description: " + activities.get(i).getDescription()+ '\n' + "Activity Cost: " + activities.get(i).getCost() +'\n' + "Available Slots Left: " + activities.get(i).getSlots()+'\n' + "---------------");
            }
        }
    }
}

