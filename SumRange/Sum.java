import java.util.stream.IntStream;

public class Sum{
	public int GetSum(int a, int b){
		if(a == b)
			return a;
	
		int start = 0;
		int end = 0;
		int sum = 0;
	
		if(a > b){
			start = b;
			end = a;
		}else{
			start = a;
			end = b;
		}	
	
		for(; start < end+1; start++)		
			sum += start;
	  
		return sum;
	}
  
	public int GetSum(int a, int b) {
       return IntStream.range(Math.min(a, b), Math.max(a, b)).sum();
	}
}