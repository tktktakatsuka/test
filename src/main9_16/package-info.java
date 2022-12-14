
package main9_16;

import java.util.Arrays;

class Main{
	public static void main(String[] args) {
		String[] a = {"B","A"};
		String[] b = {"A","B"};
		//	compareメソッドの戻り値はint
		 System.out.println(Arrays.compare(a,b));
		int c =  Arrays.compare(a,b);
		System.out.println(c);
 	}
}