package functions_code;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] nums = {1,2, 5, 6,7};
        changeval(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void changeval(int[] nums) {
        nums[0] = 100;
    }
}
