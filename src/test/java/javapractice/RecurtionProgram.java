package javapractice;

import javax.sound.sampled.ReverbType;

public class RecurtionProgram {
	
	public static void main(String[] args) {
		String s = "ashwini";
		rev(s,s.length()-1);
		
	}
	
	public static void rev(String s,int len)
	{
		if(len>=0)
		{
			System.out.print(s.charAt(len));
			len--;
			rev(s,len);
		}
	}

}
