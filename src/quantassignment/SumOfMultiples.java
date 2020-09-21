package quantassignment;

public class SumOfMultiples {

	public static void main(String[] args) {

		int i; 
		int answer = 0;

		for(i = 1; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				answer = answer + i;
			}
		}
		System.out.println(answer);
	}
}
