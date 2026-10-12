import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;
import pl.edu.pw.ee.aisd_ex_0.searcher.binary_search.BinarySearch;

public class testBinary {

    @Test
    public void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int toFind = 6;
        int expected = 5;

        int result = binarySearch.search(nums, toFind);

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