package pl.edu.pw.ee.aisd_ex_0.searcher.binary_search;

import pl.edu.pw.ee.aisd_ex_0.searcher.service.Searching;

public class BinarySearch implements Searching {

    @Override
    public int search(int[] nums, int toFind) {
        int L = 0;
        int R = nums.length - 1;

        while (L <= R) {
            int MID = L + (R - L) / 2;

            if (nums[MID] == toFind) {
                return MID;
            } else if (nums[MID] < toFind) {
                L = MID + 1;
            } else {
                R = MID - 1;
            }
        }
        return -1;
    }
}
