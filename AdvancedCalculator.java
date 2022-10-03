class Calculator {
    int add(int a , int b)
    {
        return a + b;
    }

    int sub(int a , int b)
    {
        return a - b;
    }
}

public class AdvancedCalculator extends Calculator {
    int mult(int a , int b)
    {
        return a * b;
    }

    int div(int a , int b)
    {
        return a / b;
    }

    public static void main(String args[])
    {
        AdvancedCalculator cal = new AdvancedCalculator();

        System.out.println( cal.add(1, 2) );
        System.out.println( cal.sub(1, 2) );
        System.out.println( cal.mult(1, 2) );
        System.out.println( cal.div(1, 2) );
    }
}