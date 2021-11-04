package stringassignment_2;

public class StringOperation_3 {

	public static void main(String[] args) {

		String s1=new String("Java String pool refers to collection of Strings which are stored in heap memory");
		String s2=new String("Java String pool refers to collection of Strings which are stored in heap memory");
		System.out.println(s1.toLowerCase());// converts whole string in lower case
		System.out.println(s1.toUpperCase());//converts whole string in upper c ase
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('a', 'S'));//replace all a with S
		System.out.println(s1.contains("collection"));//search collection present in s1 or not if yes then rerturn true uotherwise false
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
