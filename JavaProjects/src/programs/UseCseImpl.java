package programs;
import java.util.Scanner;


class Vehicles{
	double kms=6.0;
	double cardrive= 3.5;
	double bikedrive=4.3;
	public int morning()
	{
		int ticket=0;
		return ticket;
	}
	public int afternoon()
	{
		int ticket=0;
		return ticket;
	}
}
class Car extends Vehicles
{
	Scanner obj=new Scanner(System.in);
	double cardrive=obj.nextDouble();
	@Override
	public int morning() 
	{
		int ticket=0;
	
		if(super.cardrive==this.cardrive)
		{
			for(int i=1;i<=150;i++)
			{
			    ticket++;
		    }
			System.out.println("car has been parked");
	    }
		else if(this.cardrive<super.cardrive)
		{
			System.out.println("you have to drive "+(super.cardrive-this.cardrive)+"km to park your car");
		}
		else {
			System.out.println("No Entry because you have to park your car and start walking");
		}
	  return ticket;
	}	
	@Override
	public int afternoon() 
	{
		int ticket=0;
	
		if(super.cardrive==this.cardrive)
		{
			for(int i=1;i<=115;i++)
			{
			ticket++;
		   }
			
	}
		else if(this.cardrive<super.cardrive)
		{
			System.out.println("you have to drive "+(super.cardrive-this.cardrive)+"km to park your car");
		}
		else {
			System.out.println("No Entry because you have to park ur car and start walking");
		}
	  return ticket;
	}	
}
class Bike extends Vehicles
{
	Scanner obj=new Scanner(System.in);
	double bikedrive=obj.nextDouble();
	@Override
	public int morning() 
	{
		int ticket=0;
	
		if(super.bikedrive==this.bikedrive)
		{
			for(int i=1;i<=90;i++)
			{
			ticket++;
		}
			System.out.println("Bike has been parked");
		
	}
		else if(this.bikedrive<super.bikedrive)
		{
			System.out.println("you have to drive "+(super.bikedrive-this.bikedrive)+"km to park your Bike");
		}
		else {
			System.out.println("No Entry because you have to park ur vehicle and start walking ");
		}
	  return ticket;
	}	
	@Override
	public int afternoon() 
	{
		int ticket=0;
		if(super.bikedrive==this.bikedrive)
		   {
		for(int i=1;i<=70;i++)
		{
		   
			
			    ticket++;
		     }	
		}
	     
		else if(this.bikedrive<super.bikedrive)
		{
			System.out.println("you have to drive "+(super.bikedrive-this.bikedrive)+"km to park your Bike");
			
		}
		else {
			System.out.println("No Entry because you have to park ur Bike and start walking");
		}
		
	  return ticket;
	}	
}
public class UseCseImpl {
	public static void main(String[] args)
	{
		
		System.out.println("enter the distance covered by car like if 2.5km enter 2.5");
		
		Car fourWheelerCar=new Car(); 
	    System.out.println("no of tickets sold for only for Cars in the morning session:=="+fourWheelerCar.morning());		
	    System.out.println("no of tickets sold for only for cars in the afternoon session:=="+fourWheelerCar.afternoon());
	    int total_car_tickets=fourWheelerCar.morning()+fourWheelerCar.afternoon();
	    System.out.println("total tickets for cars per day=="+total_car_tickets);
		
	    System.out.println("enter the distance covered by bike like if 3.5km enter 3.5");
		
		 
		Bike twoWheelerBike=new Bike();
		
		System.out.println("no of tickets sold for only for Bikes in the morning session:=="+twoWheelerBike.morning());
		System.out.println("no of tickets sold for only for Bikes in the afternoon session:=="+twoWheelerBike.afternoon());
		int total_bike_tickets=twoWheelerBike.morning()+twoWheelerBike.afternoon();
		System.out.println("total tickets for bikes per day=="+total_bike_tickets);
		 
		int morningSession=fourWheelerCar.morning()+twoWheelerBike.morning();
		System.out.println("no of tickets sold for only for Cars&Bikes in the morning session:=="+morningSession);
		
		
		int afternoonSession=fourWheelerCar.afternoon()+twoWheelerBike.afternoon();
		System.out.println("no of tickets sold for only for cars&Bikes in the afternoon session:=="+afternoonSession);
		int perdayTicketCount=morningSession+afternoonSession;
		System.out.println("total no of tickets sold per day==="+perdayTicketCount);
		System.out.println("total no of tickets sold per week==="+(perdayTicketCount*7));
		System.out.println("total no of tickets sold per month==="+(perdayTicketCount*30));
		
	}

}
