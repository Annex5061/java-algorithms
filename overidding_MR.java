
//example of the overriding method
//return type and signature(parameter) same means the overriding method

class a1
{
     void hell()
    {
        System.out.println("hello i am from i1");
    }
}

class b1 extends a1
{
     void hell()
    {

        System.out.println("hello i am from i1");
    }
}

class c1 extends b1{
     void hell()
    {
        System.out.println("hello i am from i1");
    }
}

public class polymorph {

    public static void main(String[] args)
    {
        //where c1 is called reference
        // where c1() is called instance


        //c1 obj1=new c1();
       // obj1.hell();

        // now we take the reference of b1 and instance c1 as same

       // b1 obj1=new c1();
      //  obj1.hell();

        //it's means that if we change the instance than automatically
        //sentence will be changed or method /function will be change

        //reference is a1 and instance c1
        //output is of c1 method is display

       // a1 obj1=new c1();
        //obj1.hell();

        //reference is a1 and instance b1
        //output is of b1 method is display

       // a1 obj1=new b1();
       // obj1.hell();


    }
}
