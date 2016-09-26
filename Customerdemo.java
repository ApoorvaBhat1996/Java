package proram3;

public class Customerdemo {
	public static void main(String[] args)
	{ 
		 	int i;
			Customer[] c= new RegularCustomer[5];
			Customer[] p=new Privilegedcustomer[5];
			c[0]=new RegularCustomer(1, "appu ", 9738340335l, 1000d);
			c[1]=new RegularCustomer(2, "bhadra ", 9738340336l, 2000d);
			c[2]=new RegularCustomer(3, "chin ", 9738340337l, 4000d);
			c[3]=new RegularCustomer(4, " darshu ", 9738340338l, 1900d);
			c[4]=new RegularCustomer(5, "pavi ", 9738340339l, 1800d);
			for(i=0;i<c.length;i++)
			{
				System.out.println(" the billamount of"+  c[i].CustomerName +" is "+ c[i].ComputBillamount()+"\n");
	
			}
			p[0]=new Privilegedcustomer(1, "divi", 9638340335l, 1000d,"Priviledged");
			
			p[1]=new Privilegedcustomer(2, "pruthvi ", 9538340336l, 2000d,"PRIVILEGED");
			p[2]=new Privilegedcustomer(3, "deepika ", 9438340337l, 4000d,"PRIVILEGED");
			p[3]=new Privilegedcustomer(4, " abhilasha ", 9338340338l, 1900d,"Priviliged");
			p[4]=new Privilegedcustomer(5, "rishab ", 9238340339l, 1800d,"priviliged");
			for(i=0;i<p.length;i++)
			{
				System.out.println(" the billamount of"+  p[i].CustomerName +" is "+ p[i].ComputBillamount()+"\n");
	
			}

	}


}
