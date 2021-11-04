package stringassignment_2;

import java.lang.invoke.StringConcatException;

public class JoinTwoString {

	public static void main(String[] args) {

		String s1=new String("Hello");
		String s2=new String(" How are you");
		System.out.println(s1+s2);//with the help of  plus opetadtor
		
		System.out.println(s1+=s2);//this is the another way of cancatination
		System.out.println(s1.concat(" How are you!!"));//with the help of concat we can also join two string
		System.out.println(s1.concat(""));
		
	}

}
