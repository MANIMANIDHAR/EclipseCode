package programs;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class JavaElevenFeatures {

	public static void main(String[] args) {
		System.out.println("isBlank() is a boolean method.");
		
		 String str = "";
		 System.out.println(str.isBlank());
		
		 String str2="Subramanyam";
		 System.out.println(str2.isBlank());
		
		 System.out.println("repeat(n): \n it repeat the result n numbers of time i given n=4");
       
		 String str4 = "java ";
	     System.out.println(str4.repeat(4)+" ");
	     
	     System.out.println("lines() method is to return a collection of strings which are divided by line terminators.");
			
		 String str3 = "subramanyam\nAnd\nmardani";
		 System.out.println(str3.lines().collect(Collectors.toList()));
	     
	     System.out.println("stripLeading(): \nIt is used to remove the white-space which is in-front of the string");
	     
	     String str5 = "   subramanyam mardani";
	     System.out.println(str5.stripLeading());
	        
	     System.out.println("stripTrailing():\nIt is used to remove the white-space which is in back of the string");
	        
	     String str6 = "subramanyam mardani   ";
	     System.out.println(str6.stripTrailing());   
	        
	     System.out.println("strip():\nIt is used to remove the white-spaces which are in-front and back of the string");
	     String str7 = "    java 11 features   ";
	     System.out.println(str7.strip());
	     ArrayList<Integer> listOfNums = new ArrayList<Integer>();
	     listOfNums.add(45); 
	     listOfNums.add(55); 
	     listOfNums.add(65); 
	     listOfNums.add(75); 

	     listOfNums.forEach( (n)-> {System.out.println(n);});   
	}

}
