import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;
import pl.edu.pw.ee.aisd_ex_0.searcher.linear_search.LinearSearch;

public class testLinear {

    @Test
    public void testLinearSearch() {
        LinearSearch linearSearch = new LinearSearch();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int toFind = 6;
        int expected = 5;

        int result = linearSearch.search(nums, toFind);

        try {
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

