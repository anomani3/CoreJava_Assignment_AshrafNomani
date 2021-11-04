package stringassignment_2;

public class LenStr {

	public static void main(String[] args) {
		
		String s=new String("Hello World");
		System.out.println(s.length());//memory allocation in heap area
		String str=("Hello world");//memory allocation in scp
		System.out.println(str.length());
		
	}

}
