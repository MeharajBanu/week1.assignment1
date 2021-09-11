package week2.day1;


/* Pseudo Code

* a) Declare A String value as"madam"

* b) Declare another String rev value as ""
* c) Iterate over the String in reverse order
* d) Add the char into rev
* e) Compare the original String with the reversed String, if it is same then print palinDrome 

* Hint: Use .equals or .equalsIgnoreCase when you compare a String 
*/
public class StringPalindrome 
{
public static void main(String[] args)
{
String str="madam";

System.out.println("string name : " +str);

String str1=new String(str); 


for(int i = str.length()-1; i>=0; i--)
{
    str1 = str1 + str.charAt(i);
}

System.out.print("The reversed string name :" +str+ " is: ");


System.out.println(str=str1);

boolean equals = str.equals(str1);

System.out.println("str=str1 : " + equals);

}

}
	

