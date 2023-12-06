package hwicoding.function;

public class EvenOdd {
	
	// Constructor
		public EvenOdd() {
			
		}
		
	// Method
	public String evenOdd(int totalSum) {
		
		String result = "";
		if(totalSum % 2 ==0) {
			result = "짝수 입니다.";
		} else {
			result = "홀수 입니다.";
		}
		return result;
	}

}
