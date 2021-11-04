package corejava_assignment1;

public class ArmStromg_100_999 {

    public static boolean arms(int n)
    {
    	int sum=0;
    	int temp=n;
        while(n!=0)
        {
        	int r=n%10;
        	n=n/10;
        	sum=sum+r*r*r;
        }
        
        if(temp==sum)
        {
        	return true;
        }
        return false;
    }
    public static void main(String[]args) {
    	int n1=100;
    	int n2=999;
    	for (int i=n1;i<=n2;i++)
    	{
    		if(arms(i))
    		{
    			System.out.println(i);
    		}
    	}
    }
}