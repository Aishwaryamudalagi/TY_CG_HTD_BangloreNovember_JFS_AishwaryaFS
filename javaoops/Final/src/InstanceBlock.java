
public class InstanceBlock {
static final double PI;
final int MAXIMUM;
public InstanceBlock()
{
	System.out.println("COnstructor is called");
}
public InstanceBlock(int a)
{
	System.out.println("Constructor overloaded");
}
{
	System.out.println("Instance initializer block executed");
	this.MAXIMUM=3000;
}
static {
	System.out.println("static initializer block executed");
	PI=3.142;
}
}
