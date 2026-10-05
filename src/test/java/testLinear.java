import org.junit.jupiter.api.Test;

import pl.edu.pw.ee.aisd_ex_0.searcher.linear_search.LinearSearch;

public class testLinear {

    @Test
    public void testLinearSearch() {
        LinearSearch linearSearch = new LinearSearch();
        int[] nums = {1, 2, 3, 4, 5};
        int toFind = 3;
        int expected = 2;

        int result= linearSearch.search(nums, toFind);

        assert result == expected : "Expected index: " + expected + ", but got: " + result;
    }
}

