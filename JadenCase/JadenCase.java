import java.util.stream.*;

public class JadenCase {
	public String toJadenCase(String phrase) {
		if(phrase == "" || phrase == null)
		  return null;
	  
		return Stream.of(phrase.trim().split("\\s"))
		.filter(word -> word.length() > 0)
		.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
		.collect(Collectors.joining(" "));
	}

}