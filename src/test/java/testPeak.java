import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;
import pl.edu.pw.ee.aisd_ex_0.extratasks.MountainPeakProblem;

public class testPeak {
    @Test 
    public void testPeakProblem(){
        MountainPeakProblem peakProblem = new MountainPeakProblem();
        int[] arr = {0, 1, 4, 6, 5, 3, 2};
        int expected = 3;

        int result = peakProblem.peakProblem(arr);

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