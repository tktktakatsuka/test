class Sample{
	static int num = 0;
}

public class Main6_5 {
public static void main(String[] args) {
	Sample.num = 10;
	Sample s = new Sample();
	Sample s2  = new Sample();
	s.num += 10;
	s2.num = 30;
	System.out.println(Sample.num);
	
}

	
}
