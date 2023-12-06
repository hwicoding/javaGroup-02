package hwicoding.function;

public class Sum {
	
	// Constructor
	public Sum() {
		
	}
	
	// Method
	public int sumCalculator(int starNum, int endNum) {
		
		int sum = 0;
		for(int i=starNum; i<=endNum; i++) {
			sum+= i;
		}
		
		return sum;
		
	}

}
