import java.util.Arrays;
import java.util.ArrayList;
import java.security.SecureRandom;

public class ArcheryGame2{

static SecureRandom random = new SecureRandom();
	public static int[][] archeryDataCollection(int [][]  results){
		
		
		for (int count = 0; count < results.length; count++){
			for(int counter = 0; counter < results[count].length; counter++ ){
			int points = random.nextInt(10);
			results[count][counter] = points;
  }
}
return results;
}

	public static int[] totalForPlayer(int [][] results){
		int [] totals  = new int [results.length];
		for (int rows = 0; rows < results.length ; rows++){
		int total = 0;

			for(int column = 0; column < results[rows].length; column++){
			total += results[rows][column];
			
		}
totals[rows] = total;

	}
return totals;

	
	}

public static int playerWon(int [] total){
		int index = 0;
		int largest = total[0];
		for(int count = 0; count < total.length; count++){
			if (total[count] > largest){
			largest = total[count];
		  index = count;
	}


}

return index;
}



public static void main (String...args){
	
	  int [][] archeryData = new int [4][3];
    int [][]result  = archeryDataCollection(archeryData);
    int [] total = totalForPlayer(result);
	 int winner = playerWon(total);


 System.out.println("=====================================================");
System.out.print("players	  ");
for (int column =1; column < result.length; column++){
	System.out.print("chance" + column + "    ");
	

}
System.out.print("TOT");
System.out.print("\n=========================================================");
System.out.println();

	for(int rows = 0; rows < result.length; rows++  ){
	System.out.print("player " + (rows + 1)+ "   ");
		for(int column = 0; column < result[rows].length; column++ ){

System.out.print(result[rows][column] + "          ");

}
System.out.println(total[rows]);

}

System.out.println("player:" + (winner + 1) + " won");



	 }
}
			






















