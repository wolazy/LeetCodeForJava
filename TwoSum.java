import java.util.Map;
import java.util.HashMap;
/**
 * 给定一个数组和一个target求出数组中两个数相加＝ｔａｒｇｅｔ的数在数组中的位置(一个值只可以使用一次)
 * leetCode one
 */
class TwoSum{
    public static int[] twosum(int[] num,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<num.length; i++){
            if(map.containsKey(target-num[i])){
                result[0] = i;
                result[1] = map.get(target-num[i]);
            }else{
                map.put(num[i], i);
            }
        } 
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 13};
        int target = 13;
        int[] result = twosum(nums,target);
        System.out.println(result[0]+"  " +result[1]);
}
}