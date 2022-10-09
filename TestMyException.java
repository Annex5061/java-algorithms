public class TestMyException
{
	void throwExp(int i) throws MyException
{
if(i>100)
throw new MyException(i);
else
System.out.println("value :"+i);
}
public static void main(String args[])
{
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);

TestMyException t=new TestMyException();
try
{
 t.throwExp(x);
 t.throwExp(y);

}catch(Throwable e)
{
System.out.println(e);
}
}
}
