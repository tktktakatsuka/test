package main4_17;

public class Main {

	public static void main(String[] args) {
		int total = 0;
		a: for(int i=0;i<5; i++) {
			b:for(int j = 0; j<5; j++) {
				//2で割り切れる場合はスキップ
				if(i %2==0) continue a;
				
				//１，２の時はスキップ
				if(3 < j) break b;
				total += j; 
			}
		}
		System.out.println(total);
	}
	
}
