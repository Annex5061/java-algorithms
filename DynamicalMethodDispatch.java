class phone
{
    void call()
    {
        System.out.println("calling by phone");
    }

    void on()
    {
        System.out.println("Turning on phone");
    }
}

class smartphone extends phone
{
    void music()
    {
        System.out.println("Playing music by Smartphone");
    }

    void on()
    {
        System.out.println("Turning on Smartphone");
    }
}

class DynamicalMethodDispatch
{
    public static void main(String[] args)
    {
        // smartphone smph = new smartphone();   
        // smph.call();  smph.on();

        phone ph = new smartphone();
        ph.on();
        ph.call();

    }
}