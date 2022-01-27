package week1.day2.assignment3;

public class CharOccurance {
	
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
			String str = "welcome to chennai";
			int count=str.length();
			int count2=str.replace("e", "").length();
			int totalcount=count-count2;
			System.out.println("Number Occurence of e is" +totalcount);
	}
			
			
			
			


}
