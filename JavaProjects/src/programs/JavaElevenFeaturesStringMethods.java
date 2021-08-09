package programs;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaElevenFeaturesStringMethods {

	public static void main(String[] args) {
		
		System.out.println("isBlank() is a boolean method.\n It just returns true when a string is empty and vice-versa.");
		
		 String str1 = "";
		 System.out.println(str1.isBlank());
		
		 String str2="Kurnool";
		 System.out.println(str2.isBlank());
		
		 System.out.println("lines() method is to return a collection of strings which are divided by line terminators.");
		
		 String str3 = "Kurnool\nAnd\nBetamcherla";
		 System.out.println(str3.lines().collect(Collectors.toList()));
		
		 System.out.println("repeat(n): \n Result is the concatenated string of original string repeated the number of times in the argument");
        
		 String str4 = "Hyderabad - City of Pearls";
	     System.out.println(str4.repeat(4)+" ");
	     
	     System.out.println("stripLeading(): \nIt is used to remove the white-space which is in-front of the string");
	     
	     String str5 = "   Hyderabad - City of Pearls";
	     System.out.println(str5.stripLeading());
	        
	     System.out.println("stripTrailing():\nIt is used to remove the white-space which is in back of the string");
	        
	     String str6 = "Hyderabad - City of Pearls    ";
	     System.out.println(str6.stripTrailing());   
	        
	     System.out.println("strip():\nIt is used to remove the white-spaces which are in-front and back of the string");
	     String str7 = "    Hyderabad - City of Pearls   ";
	     System.out.println("spaces removed before and after");
	     System.out.println(str7.strip());
	        
	        
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        arrlist.add(4); 
	        arrlist.add(5); 
	        arrlist.add(6); 
	        arrlist.add(7);
	        arrlist.add(8);

	        arrlist.forEach( (n)-> {System.out.println(n);});
	        
	        System.out.println("variable used in lambda expression\n");
	        
	        IntStream.of(1,2,3,4,5,6,7).filter((var i)->i%2==0).forEach(System.out::println);
	        
            System.out.println("variable without using lambda expression");
	        
	        IntStream.of(1,2,3,4,5).filter(i->i%2==0).forEach(System.out::println);
	        
	}

}
