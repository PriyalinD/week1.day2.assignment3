package week1.day2.assignment3;

public class FindType {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		//Convert the String to character array
		char[]testArr=test.toCharArray();
		
//		 Traverse through each character (using loop)
		for(int i=0;i<test.toCharArray().length;i++)
		{
			if(Character.isLetter(testArr[i]))
			{
				
				letter=letter+1;
			}
			else if(Character.isDigit(testArr[i]))
			{
				
				num=num+1;
			}
			else if(Character.isSpaceChar(testArr[i]))
			{
				
				space=space+1;
			}
			else
			{
				
				specialChar=specialChar+1;
				
				}
		}
	
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

}
}
			
		

