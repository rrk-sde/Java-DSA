class Super
{
Void meth1()
{
System.out.println(“meth1”);
}
Void meth2()
{
System.out.println(“super meth2”);
}
}
class Sub extends Super
{
Void meth2()
{
System.out.println(“sub meth2”);
}
Void meth3()
{
System.out.println(“meth3”);
}
}
class test
{
public.static.void.main()
{
Super s=new Sub();
}
}