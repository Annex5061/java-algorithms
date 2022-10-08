class Student{
    int rollno;
    String name;
    float fee;
    Student(int roll,String names,float fees){
        rollno=roll;
        name=names;
        fee=fees;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class OopsConcept{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
