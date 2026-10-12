import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;
import pl.edu.pw.ee.aisd_ex_0.extratasks.HotOrColdProblem;

public class testHotOrCold {
    @Test 
    public void testGuess(){
        HotOrColdProblem peakProblem = new HotOrColdProblem();
        int n = 18;
        int expected = 7;
        int result = peakProblem.guessNumber(n);

        try{
            assertEquals(expected, result,
                "Expected: " + expected + ", but got: " + result);
            System.out.println("Wynik wyszukiwania: " + result);
        } catch (AssertionFailedError e) {
            System.out.println(
            "Expected: " + expected + ", but got: " + result);
            throw e;
        }
    }
}