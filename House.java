import java.util.ArrayList;
import javax.management.RuntimeErrorException;

/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /** Accessors for number of residents */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /** Accessors for number of residents */
  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name) {
    // check if this.residents contains name
    if (this.residents.contains(name)){
    // if so: throw an exception
    throw new RuntimeException(name + "is already a resident of" + this.name);
    //append name to this.residents
    }
    this.residents.add(name);
  }

  public String moveOut(String name){
    if (!this.residents.contains(name)){
      throw new RuntimeException(name + "doesn't live here");
    }
    this.residents.remove(name);
    return name;
  }

  public boolean isResident(String person){
    this.residents.contains(person);
    return true;
    }
  

  public String toString(){
    String description = super.toString();
    description += " There are currently " + this.residents.size() + " people in this house.";
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else{
      description += "does not have";
    }
    description += " an active dining room.";
    return description;
  }

  public void showOptions() {
    super.showOptions();
    System.out.println(" + isResident() /n moveIn() /n + moveOut() /n + nResidents()/n + hasDiningRoom()");
}

  

  public static void main(String[] args) {
    House morrow = new House("Morrow", "The Quad", 4, false);
    System.out.println(morrow);
    morrow.moveIn("Jordan");
    morrow.moveIn("Jordan");
    System.out.println(morrow);
    House king = new House("King", "The Quad", 3, true);
    System.out.println(king);
  }


}