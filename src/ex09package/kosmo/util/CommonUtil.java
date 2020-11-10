package ex09package.kosmo.util;

public class CommonUtil {

	
	/*
	 전달된 문자열을 검사하여 숫자가 아닌 문자가 포함된 경우 false를 반환하고,
	 모두 숫자인 경우 true를 반환한다.
	 */
	public static boolean isNumber(String strValue)
	{
		if(strValue.length()==0)
			return false;
			
		for(int i=0 ; i<strValue.length(); i++)
		{
			int acode = strValue.codePointAt(i); //각 인덱스에 해당하는 문자의 아스키 코드값을 반환함
			if(!(acode>='0' && acode<='9'))		 //codePointAt
			{
				return false;
			}
		}
		return true;
	}
	
}
