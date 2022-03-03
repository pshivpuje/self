package palindrome.StringPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
	
	String input1= "Noon";
	App app=new App();
	boolean expected = true;
   
    @Test
    public void isPalindromeTest()
    {
    assertedequals(expected, app.isPalindrome(input1));
    }

	private void assertedequals(boolean expected2, boolean palindrome) {
		// TODO Auto-generated method stub
		
	}
}
