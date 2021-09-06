package Assignment.week1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=454;
	int temp=i;
	System.out.println("before comparing");
	System.out.println("value of i: "+i);

	if(i==temp) {
	System.out.println("after comparing");
	System.out.println(" is both are same value: "+(i==temp));
	System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
		
	}
	}
}

