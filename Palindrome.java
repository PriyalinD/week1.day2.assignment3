package week1.day2.assignment3;

public class Palindrome {
	public static void main(String[] args) {

	    String name = "madam",
	    reverseName = "";
	    
	    int nameLength = name.length();

	    for (int i = (nameLength - 1); i >=0; --i) {
	      reverseName = reverseName +name.charAt(i);
	    }

	    if (name.equals(reverseName)) {
	      System.out.println(name + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(name + " is not a Palindrome String.");
	    }
	  }
	}
