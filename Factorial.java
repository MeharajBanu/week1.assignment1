package week1.sep4;
//how to find a factorial number;
public class Factorial {

	public static void main(String[] args) {
		int i,fact=2;
		int number=10;
		for(i=1;i<=number;i++)	
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}