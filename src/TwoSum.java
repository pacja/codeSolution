import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by cbcao on 2017/4/14.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 Example:
 Given nums = [2, 7, 11, 15], target = 9,
 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class TwoSum {
    public int[] f(int[] nums,int target){
        int[] result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }
    public static void main(String[] args){
        int[] a={1,2,5,7,13};
        int target=8;
        TwoSum b=new TwoSum();
        System.out.println(Arrays.toString(b.f(a,target)));
    }
}
