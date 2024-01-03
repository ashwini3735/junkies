package javapractice;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StringProgram {

	@Test
	public void Reverceeachword()
	{
		String s = "welcome to tyss baglore";
		String [] st = s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String str = st[i];
			for (int j = str.length()-1; j >=0; j--) {
				System.out.print(str.charAt(j));
				
			}
			System.out.print(" ");
			
		}
	}
	
	@Test
	public void Reverevenidex()
	{
		String s = "welcome to tyss baglore";
		String [] st = s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String str= st[i];
			if(i%2!=0)
			{
				for (int j = str.length()-1; j >=0; j--) {
					System.out.print(str.charAt(j));
					
				}
				System.out.print(" ");
			}
			
			else {
				System.out.print(st[i]+" ");
			}
			
		}
		
	}
	
	@Test
	public void segregatenumber()
	{
		String s = "12abcd25nmg45nmh8mk9";
		String [] st = s.split("[A-Za-z]");
		for (int i = st.length-1; i >=0; i--) {
			if(st[i].equals(""))
			{
			
			}
			else
			{
				System.out.print(st[i]+",");
			}
			
		}
		
	}
	@Test
	public void OwalAndConsontes()
	{
		String s = "ashvobivoiba";
		char [] ch = s.toCharArray();
		int vowalcount=0;
		int consonentcount=0;
		
		for (int i = 0; i < ch.length; i++) {
			
		
		if(ch[i]=='a'|| ch[i]=='i'|| ch[i]=='o'||ch[i]=='v')
		{
			vowalcount++;
		}
		else
		{
			consonentcount++;
		}}
		System.out.print(vowalcount);
		System.out.print(consonentcount);
	}
	
	@Test
	public void reverc()
	{
		String s = "ashwini";
		int len = s.length();
		String temp = " ";
		for (int i =len-1; i >=0; i--) {
			temp =temp+s.charAt(i);
			
		}
		System.out.println(temp);
	}
	@Test
	public void changeUppercaseforalternativechar()
	{
		String s = "ashwinibeli";
		char [] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
				
			
			}
			
		}
		System.out.print(ch);
		//Select s1 = new Select(e1);
		//s1.getOptions()
	}
	
	
	


}
