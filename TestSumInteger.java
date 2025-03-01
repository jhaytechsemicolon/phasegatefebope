import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestSumInteger{

	@Test
	 public void testThatSumIntegerIsCorrect(){


	SumInteger sums = new SumInteger();
	
	int sum = sums.sum(30);
	assertEquals(165, sums.sum(30));
	
	
  }
}