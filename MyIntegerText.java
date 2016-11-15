package Javatext_3;

import java.util.*;

public class MyIntegerText {
	public static void main(String args[]){
		MyInteger myinteger1 = new MyInteger();
		MyInteger myinteger2 = new MyInteger(15);
		MyInteger myinteger3 = new MyInteger();
		Scanner in = new Scanner(System.in);
		System.out.println("«Î ‰»Îvalueµƒ÷µ£∫");
		myinteger1.value = in.nextInt();		
		System.out.println(myinteger1.isEven());
		System.out.println(myinteger1.isOdd());
		System.out.println(myinteger1.isPrime());
		System.out.println(myinteger2.isEven());
		System.out.println(myinteger2.isOdd());
		System.out.println(myinteger2.isPrime());
		myinteger3.value=MyInteger.parseInt("32523");
		System.out.println(myinteger3.isEven());
		System.out.println(myinteger3.isOdd());
		System.out.println(myinteger3.isPrime());		
	}

}

class MyInteger{
	int value;
	public MyInteger(){
	}
	public MyInteger(int value){
		this.value=value;
	}
     public boolean isEven(){
		if(this.value%2==0){
			return true;
		}
		else{
			return false;
		}
	}
    public boolean isOdd(){
    	if(this.value%2!=0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    public boolean isPrime(){
    	int i,a=0;
    	for(i=2;i<this.value;i++){
    		if(this.value/i==0) a++;
    	}
    	if(a==0) return true;
    	else return false;
    }
    public static int parseInt(String s){
    	return Integer.valueOf(s);
    }
	private static int valueOf(String s) {
		return 0;
	}
	public static int parseInt(char[] c){
		return Integer.valueOf(new String(c));
	}
}
