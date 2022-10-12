class area{
    int l,b;
    area(){
        l=0;
        b=0;
    }
    area(int l,int b){
        this.l=l;
        this.b=b;
    }
    area(int l){
        this.l=l;
        this.b=l;
    }
    area(area a){
        this.l=a.l;
        this.b=a.b;
    }
    
    void show(){
        System.out.println("Area of rectangle is "+l*b);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        area a1=new area();
        a1.show();
        area a2=new area(10,20);
        a2.show();
        area a3=new area(30);
        a3.show();
        area a4=new area(a2);
        a4.show();
    }
}