package main;
import java.util.*;

public class MinMax {

    public int[] findMinAndMax(int nums[]){
        int len = nums.length;
        int res[] = {nums[0], nums[0]};

        for(int i = 0; i < len; ++i){
            res[0] = Math.min(res[0], nums[i]);
            res[1] = Math.max(res[1], nums[i]);
        }
        return res;
    }

}
