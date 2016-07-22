import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
int number;
number=in.nextInt();
int sum=0;
int sum1 = 0;
int b=0;
while(number>0){
	b=number%10;
	sum=sum+b;
	number=number/10;
}
System.out.println(sum);
int z=sum;
int c=0;
while(sum!=0){
	c=c*10;
	c=c+sum%10;
	sum=sum/10;
}
System.out.println(c);
	if(c==z){
		
		System.out.println("palindrome");
	}
	else{
		System.out.println("not a palindrome");
	}
	}}