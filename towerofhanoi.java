import java.util.Scanner;

public class Main {
  //Recursive Function
  public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
    // Write your code here
    if (disks == 0) { //Base Case 1
      return;
    }
    if (disks == 1) { //Base Case 2
      System.out.println(source + " " + destination);
      return;
    } else {
      //Shifting d-1 disk from A to C
      towerOfHanoi(disks - 1, source, destination, auxiliary);
      System.out.println(source + " " + destination);
      //Shifting d-1 disk from c to B
      towerOfHanoi(disks - 1, auxiliary, source, destination);
    }
  }

  public static void main(String[] args) {
    int disk;
    Scanner s = new Scanner(System.in);

    System.out.print("Print No of Disks: ");
    disk = s.nextInt();

    towerOfHanoi(disk, 'A', 'C', 'B');
  }
}