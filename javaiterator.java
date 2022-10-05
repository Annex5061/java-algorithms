import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
  
    // Make a collection
    ArrayList<String> animes = new ArrayList<String>();
    animes.add("Fullmetal Alchemist: Brotherhood");
    animes.add("Gintama");
    animes.add("Mushoku Tensei");
  
    // Get the iterator
    Iterator<String> it = animes.iterator();
  
    // Print the first item
    System.out.println(it.next());
  }
}
