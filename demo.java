import java.util.*;
interface shapes
{
   public void area();
   public void volume();
}
class squpyr implements shapes
{
	double a,h,sq,sq1;
	Scanner sc=new Scanner(System.in);
	void get(){
	System.out.println("Enter the side of the square and the height:");
	a=sc.nextDouble();
	h=sc.nextDouble();
	}
	public void area()
	{
		sq=(a*a)+(2*a*Math.sqrt((a*a)/4+(h*h)));
		System.out.println("Area of the square pyramid is:"+sq);
	}
	public void volume()
	{
		sq1=(a*a*h)/3;
		System.out.println("Volume of square pyramid:"+sq1);
	}
}
class sphere implements shapes
{
	Scanner sc=new Scanner(System.in);
    double radius,pi=3.14;
	double sp,sp1;
	void getd()
	{
		System.out.println("Enter the radius:");
	radius=sc.nextDouble();
	
	}
	public void area()
	{
		sp=4*pi*(radius*radius);
		System.out.println("Area of the sphere is:"+sp);
	}
	public void volume()
	{
		sp1=(4/3)*pi*(radius*radius*radius);
		System.out.println("Volume of sphere:"+sp1);
	}
}
class recprism implements shapes
{
	Scanner sc=new Scanner(System.in);
   int l,w,h,rp,rp1;
	void getdd()
	{
		System.out.println("Enter the length,width and height:");
	l=sc.nextInt();
	w=sc.nextInt();
	h=sc.nextInt();
	
	}
	public void area()
	{
		rp=2*((w*l)+(h*l)+(h*w));
		System.out.println("Area of the rectangle prism is:"+rp);
	}
	public void volume()
	{
		rp1=w*h*l;
		System.out.println("Volume of rectangle prism:"+rp1);
	}
}
class cube implements shapes
{
	Scanner sc=new Scanner(System.in);
   int a,c,c1;
	void getdetail()
	{
		System.out.println("Enter the side:");
	a=sc.nextInt();
	
	
	}
	public void area()
	{
		c=6*a;
		System.out.println("Area of the cube is:"+c);
	}
	public void volume()
	{
		c1=a*a*a;
		System.out.println("Volume of cube:"+c1);
	}
}
class cylinder implements shapes
{
	Scanner sc=new Scanner(System.in);
   double pi=3.14,r,h,cy,cy1;
	void getde()
	{
		System.out.println("Enter the radius and height:");
	r=sc.nextDouble();
	h=sc.nextDouble();
	
	}
	public void area()
	{
		cy=(2*pi*r*h)+(2*pi*r*r);
		System.out.println("Area of the cylinder is:"+cy);
	}
	public void volume()
	{
		cy1=pi*r*r*h;
		System.out.println("Volume of cylinder:"+cy1);
	}
}
class demo
{
	public static void main(String args[])
	{
		squpyr s=new squpyr();
		cylinder cl=new cylinder();
		cube cu=new cube();
		recprism r=new recprism();
		sphere sh=new sphere();
		s.get();
		s.area();
		s.volume();
		sh.getd();
		sh.area();
		sh.volume();
		r.getdd();
		r.area();
		r.volume();
		cu.getdetail();
		cu.area();
		cu.volume();
		cl.getde();
		cl.area();
		cl.volume();
	}
}
     	
	