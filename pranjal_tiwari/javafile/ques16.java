// package pranjal_tiwari.javafile;
interface A
{
    public void base1();
}
interface B
{
    public void base2();
}
class C implements A,B
{
    public void base1()
    {
        System.out.println("calling function base1");
    }
    public void base2()
    {
        System.out.println("calling function base2");
    }
}
public class ques16
{
	public static void main(String[] args) 
	{
		C obj = new C(); 
		obj.base1(); 
		obj.base2(); 
	}
}
