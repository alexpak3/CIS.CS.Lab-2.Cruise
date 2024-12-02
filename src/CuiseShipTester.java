import java.util.List;

public class CuiseShipTester {
    private static CruiseShip cruise;
    private static Destination dest1, dest2, dest3, dest4;
    private static SightSeeing act1, act3, act5, act7;
    private static Walkingtour act2, act6;
    private static TheatreShow act4;

    private static List<Activity> actList1, actList2, actList3, actList4;

    private static Passenger passenger1, passenger2, passenger3, passenger4, passenger5, passenger6, passenger7;

    public static void main(String[] args) {

        dest1 = new Destination("USA");
        dest2 = new Destination("China ");
        dest3 = new Destination("Japan ");
        dest4 = new Destination("Russia");


        act1 = new SightSeeing("The Peak Visit", "Ocean Park is an animal theme park in Hong Kong.", 10, 1);
        act2 = new Walkingtour(10, 500,  "Walk around pacific harbour", "We walk around Pacific harbour cause why not ",50);
        dest1.addActivities(act1);
        dest1.addActivities(act2);

        // create act objects for Macau destination
        act3 = new SightSeeing("Casino", "Venetian Macau Resort Hotel Casino", 20, 2);
        act4 = new TheatreShow("Random Play Name", "We are going to vist a random Play cause yes ", 6, 300 );
        Actor actor1 = new Actor("John", "Joe");
        Actor actor2 = new Actor("Jeff", "Jerard");
        Actor actor3 = new Actor("Jack", "Jaques");
        Actor actor4 = new Actor("James", "Jimmy");
        act4.setCast(actor1);
        act4.setCast(actor2);
        act4.setCast(actor3);
        act4.setCast(actor4);
        dest2.addActivities(act3);
        dest2.addActivities(act4);

        // create act objects for Guangzhou destination
        act5 = new SightSeeing("Chimelong Paradise", "Chimelong Paradise is a major amusement park in Panyu District, Guangzhou, Guangdong, China.", 15, 4);
        dest3.addActivities(act5);

        // create act objects for Shanghai destination
        act6 = new Walkingtour(30, 100,  "Eiffel Tower", "Visit Eiffel Tower cause why not ",60);
        act7 = new SightSeeing("Shanghai Natural History Museum.", "The Shanghai Natural History Museum is a museum dedicated to natural history in the city of Shanghai.", 3, 2);
        dest4.addActivities(act6);
        dest4.addActivities(act7);

        // create passengers
        passenger1 = new Passenger("Mr. Ewing", 01, "premium");
        passenger2 = new Passenger("Mr. Li", 02, "premium");
        passenger3 = new Passenger("Katie F", 03, "regular");
        passenger4 = new Passenger("Emily M", 04, "regular");
        passenger5 = new Passenger("Howard Deng", 05, "elderly");
        passenger6 = new Passenger("Me", 06, "elderly");
        passenger7 = new Passenger("Sander T Day", 07, "elderly");
        passenger3.setBalance(100);
        passenger4.setBalance(100);
        passenger5.setBalance(100);
        passenger6.setBalance(100);
        passenger7.setBalance(100);




        cruise = new CruiseShip("Ship name ", 100);

        cruise.addDestination(dest1);
        cruise.addDestination(dest2);
        cruise.addDestination(dest3);
        cruise.addDestination(dest4);
        cruise.addPassenger(passenger1);
        cruise.addPassenger(passenger2);
        cruise.addPassenger(passenger3);
        cruise.addPassenger(passenger4);
        cruise.addPassenger(passenger5);
        cruise.addPassenger(passenger6);
        cruise.addPassenger(passenger7);

        testCase1();
        System.out.println("--------------------------------");
        testCase2();
        System.out.println("--------------------------------");
        testCase3();

    }

    public static void testCase1(){
        System.out.println(passenger3.getBalance());

        // to check if the sign-up system works
        act1.signup(passenger3);
        act1.signup(passenger2);

        System.out.println(act1.getSignups());
        System.out.println(act1.getSlots());
        System.out.println(passenger3.getBalance());

    }

    public static void testCase2(){

        //check elderly price change

        System.out.println(passenger6.getBalance());
        act2.signup(passenger6);
        System.out.println(act2.getSignups());
        System.out.println(act2.getSlots());
        //check if has signed up
        System.out.println(passenger6.getHassignuped());
        System.out.println(passenger6.getBalance());

    }

    public static void testCase3(){
        act3.signup(passenger4);
        //check for overlap signups
        act3.signup(passenger4);
        System.out.println( act3.getSignups());
    }


}
