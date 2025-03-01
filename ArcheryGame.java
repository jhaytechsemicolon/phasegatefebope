import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArcheryGame{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	ArrayList <Integer> totals = new ArrayList<>();

	int numberOfPlayers = 0;
	int numberOfChances = 0;
		
	System.out.println("enter number of players");
	numberOfPlayers = input.nextInt();
	
	System.out.println("enter number of chances");
	numberOfChances = input.nextInt();
	int [][] result = new  int [numberOfPlayers][numberOfChances];

	for(int count = 0; count < numberOfPlayers; count++){
		for (int counter = 0; counter < numberOfChances; counter++){
	
	System.out.println("Entering Score for player" + (count + 1));
	System.out.println("entering score for chance" + (counter + 1));
	result[count][counter] = input.nextInt();
	

		}


	}
	System.out.println("========================================");

	System.out.print("Players      ");


	for (int column = 1; column <= numberOfChances; column++){
		System.out.print("chance" + column + "   ");
		
		}
		System.out.print("TOT");	
		System.out.println();
	System.out.println("========================================");


	
	for(int rows = 0; rows < numberOfPlayers; rows++ ){
	System.out.print("player"+ (rows+1) + "      ");
		int total = 0;	
		for(int column = 0; column < numberOfChances; column++){
		System.out.print(result[rows][column] + "        ");
		total += result[rows][column];
		}
		totals.add(total);
		System.out.print(total + "        ");
		
		System.out.println();
	 	}
	
	int largest = totals.indexOf(0);
	for (int count =0 ; count < totals.size(); count++){

	if(totals.get(count) >largest){
	largest = totals.get(count);
}
	}
	int index = totals.indexOf(largest);
 System.out.print("player:" + (index + 1) + "  won");
	
	
	}
}