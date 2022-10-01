package vid24oops;

//Method Overloading or Run time Polymorphism (Functions can be called as per required in any type of Polymorphism)
// class Student{
//     String name;
//     int age;

//     public void displayInfo(String name) {
//               System.out.println(name);
//         }

//     public void displayInfo(int age) {
//               System.out.println(age);
//         }

//     public void displayInfo(String name, int age) {
//              System.out.println(name);
//              System.out.println(age);
//         }  
//    }

// public class polymorphism {
//     public static void main(String[] args) {
//         Student s1 = new Student();

//         s1.name = "Adi";
//         s1.age= 21;

//         s1.displayInfo(s1.name); //If we want only name to display

//         s1.displayInfo(s1.age); //If we want only age to display

//         s1.displayInfo(s1.name,s1.age); //If we want name and age to display
//     }
// }

//Run time polymorphism
// abstract class Animal {
//         abstract void walk();
//         void breathe() {
//         System.out.println("This animal breathes air");
//          }

//     Animal() {
//           System.out.println("You are about to create an Animal.");
//      }
//     }

//     class Horse extends Animal {
//     void walk() {
//          System.out.println("Horse walks on 4 legs");
//         }
//     }

//     class Chicken extends Animal {
//     void walk() {
//             System.out.println("Chicken walks on 2 legs");
//         }
//     }
    
//     public class polymorphism {
//     public static void main(String args[]) {
//     Horse horse = new Horse();
//     horse.walk();
//     horse.breathe();

//     Animal animal = new Animal();
//     animal.walk(); //Gives error when you run, but not when you compile
//     }
// }
