import java.util.Stack;

public class stack_usingarrays {
    static int push(int k,int []arr,int i){
        int temp=i;
        temp=temp+1;
        arr[temp]=k;

        return temp;
    }
    static int pop(int []arr,int i){
        int temp=i;
        temp=temp-1;
        arr[i]=0;
        return temp;
    }
    static int top(int arr[],int temp){
        return arr[temp+1];
    }
    static boolean empty(int temp){
        boolean flags=false;
       //if temp is pointing at imagnary point , i.e, -1
        if (temp==-1){
            flags=true;
        }

        return flags;
    }



    public static void main(String[] args) {
        int[] arr=new int[4];
        //pushing the first
        var temp=-1;

        //printing the array


        System.out.println( push(3,arr,temp));
        System.out.println(push(4,arr,temp));

        push(4,arr,temp);
        push(4,arr,temp);
        System.out.println( empty(temp));//
    }
}
