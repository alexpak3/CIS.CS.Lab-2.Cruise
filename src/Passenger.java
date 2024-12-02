public class Passenger {
    private String name;
    private int passengerNumber;
    private String type;
    private double balance;

    private boolean hassignuped;

    public Passenger(String name, int passengerNumber, String type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.hassignuped = false;
        setType(type);

    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }


    public void setType(String type) {
        if (type.equalsIgnoreCase("elderly") || type.equalsIgnoreCase("premium") || type.equalsIgnoreCase("regular")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid passenger type. Please input either elderly, premium, or regular.");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void setHassignuped(boolean hassignuped) {
        this.hassignuped = hassignuped;
    }


    public boolean getHassignuped (){
        return this.hassignuped;
    }
}
