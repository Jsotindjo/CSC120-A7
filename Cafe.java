/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 110;
        this.nSugarPackets = 100;
        this.nCreams = 90;
        this.nCups = 200;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= size;
        this.nCreams -= size;
        this.nCups -= size;

    }
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if( nCoffeeOunces == 0)
        this.nCoffeeOunces += nCoffeeOunces;
    }

    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goToFloor(n)");
    }

    public void goToFloor(int floorNum) {
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (this.activeFloor != 1){
            System.out.println("You do not have access to other floors");
        }
    }

    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
