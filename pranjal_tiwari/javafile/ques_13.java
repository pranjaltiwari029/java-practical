// package pranjal_tiwari.javafile;
interface A
{
    public void func_A();
}
interface B
{
    public void func_B();
}
class C implements A,B
{
    public void func_A()
    {
        System.out.println("calling function func_A");
    }
    public void func_B()
    {
        System.out.println("calling function func_B");
    }
}
public class ques_13
{
	public static void main(String[] args) 
	{
		C obj = new C(); 
		obj.func_A(); 
		obj.func_B(); 
	}
}
