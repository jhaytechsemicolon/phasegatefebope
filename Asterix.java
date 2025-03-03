public class Asterix{
public static void main(String...args){

System.out.println("(a)        " + "(b)          " + "(c)        " + "(d)        ");	
for (int count = 1; count <= 10; count++ ){
	for(int counter = 1; counter <= count; counter++){
		System.out.print("*");
	}
System.out.print(" ");
  

	for(int b = 10; b >= count; b -- ){
 		System.out.print(" ");
 	}
	for(int c = 10; c >= count; c--){
		System.out.print("*");
		}
	for(int d = 1; d <= count; d ++ ){
 		System.out.print(" ");
	}
	for(int e = 1; e <= count; e ++ ){
 		System.out.print(" ");
	}
	for(int f = 10; f >= count; f -- ){
 		System.out.print("*");
	}
	for(int g = 10; g >= count; g -- ){
 		System.out.print("");
	}
	for(int h = 10; h >= count; h--){
		System.out.print(" ");

	
	}
	for(int j = 1; j <= count; j ++ ){
 		System.out.print("*");

	}


	



		
	System.out.println();
	}

}
}	 