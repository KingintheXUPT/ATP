package Javatext_3;

import java.util.*;

public class MyPointText {
	public static void main(String[] args){
		MyPoint mypoint1 =new MyPoint();
		Scanner in = new Scanner(System.in);
		System.out.println("请输入x与y的值");
		mypoint1.x= in.nextInt();
		mypoint1.y= in.nextInt();
		System.out.println(mypoint1.distance());
	}

}


class MyPoint{
	int x;
	int y;
	int x1=0;
	int y1=0;
	public MyPoint(){		
	}
	public MyPoint(int x,int y){
		this.x= x;
		this.y=y;
	}
	public int get1(){
		return this.x;
	}
	public int get2(){
		return this.y;
	}
	public double distance(){
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}	
}
