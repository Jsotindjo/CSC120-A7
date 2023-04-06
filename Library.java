import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  public void addTitle(String title){
    if (this.collection.contains(title)){
      throw new RuntimeException(title + "is already in the library");
      }
      this.collection.put(title, true);
    }

  public String removeTitle(String title){
    if(!this.collection.contains(title)){
      throw new RuntimeException(title + "is not in this library");
      }
      this.collection.remove(title, false);
      return title;
    }// return the title that we removed

  public void checkOut(String title){
    this.collection.replace(title, false);
    }

  public void returnBook(String title){
    this.collection.replace(title, true);
    }

  public boolean containsTitle(String title){
    return this.collection.contains(title);
    }

  public boolean isAvailable(String title){
    return(this.collection.get(title));
    }
    

    for(String title: this.collection.keyset()){
      System.out.println(title + ("") + this.collection.get(title));
    }



  }


    public static void main(String[] args) {
      Library myLibrary = new Library("Neilson","Elm Street", "4.0");
    }
  
  }