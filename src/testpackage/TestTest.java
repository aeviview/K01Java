package testpackage;

public class TestTest {

	public boolean Palindrome(String string)
	{
		int x= 0;
		int y = string.length()-1;
		
		while(x<y)
		{
			if(string.charAt(x)!=string.charAt(y))
			{
				return false;
			}
			x +=1;
			y -=1;
		}
		return true;
	}


}