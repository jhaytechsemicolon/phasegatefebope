import java.util.Scanner;
public class SumInteger{
  public static int sum(int number){
    
 	int total = 0;
      for(int i = 1; i <= 30;  i++){
      if( i % 3 == 0){
	total += i;
   

   }
 }
return total;
}

public static void main(String...args){
int number = 30;
System.out.println(sum(number));
  }
}
