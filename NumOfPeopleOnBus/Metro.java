import java.util.ArrayList;

public class Metro{
  public static int countPassengers(ArrayList<int[]> stops) {
    int passengers = 0;
    
    for(int[] i : stops){
      passengers = (passengers + i[0]) - i[1];
    }
    
    return passengers;
  }
  
  public static int countPassengersNew(ArrayList<int[]> stops) {
	return stops.stream()
				.mapToInt(x -> x[0] - x[1])
				.sum();
  }
}