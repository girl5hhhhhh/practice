package com.example.practice.solution;

import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: practice
 * @description:
 * @author: YouName
 * @create: 2023-04-20 15:50
 **/
public class Solution1 {
    public static void main(String[] args) {
        /*1 删除排序数组中的重复项*/
        //输入数组，期望答案{0,1,2,3,4}
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //输入数组，期望答案{1,2}
        int[] nums1 = {1,1,2};
        //removeDuplicates(nums1);

        /*2 买卖股票的最佳时机 II*/
        //输入数组，期望答案7
        //int[] prices = {7,1,5,3,6,4};
        //输入数组，期望答案4
        //int[] prices = {1,2,3,4,5};
        //输入数组，期望答案0
        int[] prices = {7,6,4,3,1};
        //maxProfit(prices);

        /*3 旋转数组*/
        //输入: nums = [1,2,3,4,5,6,7], k = 3 输出: [5,6,7,1,2,3,4]
        int[] nums2 = {1,2,3,4,5,6,7};
        //rotate(nums2,3);

        /*4 存在重复元素*/
        //输入：nums = [1,2,3,1] 输出：true
        //int[] nums3 = {1,2,3,1};
        int[] nums3 = {1,2,3,4};
        //boolean b = containsDuplicate(nums3);
        //System.out.println(b);

        /*5 只出现一次的数字*/
        //输入：nums = [2,2,1] 输出：1
        int[] nums4 = {2,2,1};
        //singleNumber(nums4);

        /*6 两个数组的交集 II*/
        //输入：nums1 = [1,2,2,1], nums2 = [2,2] 输出：[2,2]
        int[] nums5 = {1,2,2,1};
        int[] nums6 = {2};
        intersect(nums5,nums6);
    }
/*

    public static int removeDuplicates(int[] nums) {
        List<Integer> ints = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ints.size(); i++) {
            boolean add = set.add(ints.get(i));
            if(!add){
                ints.remove(i);
                i = i - 1;
            }
        }
        System.out.println(ints);
        return ints.size();
    }

    public static int removeDuplicates(int[] A) {
        //边界条件判断
        if (A == null || A.length == 0)
            return 0;
        int left = 0;
        for (int right = 1; right < A.length; right++)
            //如果左指针和右指针指向的值一样，说明有重复的，
            //这个时候，左指针不动，右指针继续往右移。如果他俩
            //指向的值不一样就把右指针指向的值往前挪
            if (A[left] != A[right])
                A[++left] = A[right];
        return ++left;
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            //原数组中如果后一个减去前一个是正数，说明是上涨的，
            //我们就要累加，否则就不累加
            total += Math.max(prices[i + 1] - prices[i], 0);
        }
        System.out.println(total);
        return total;
    }

    public static void rotate(int[] nums, int k) {
        int[] resultNum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            resultNum[(i+k) % nums.length] = nums[i];
        }
        System.out.println(resultNum);
    }

    public static void rotate(int nums[], int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
        System.out.println(nums);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    public static int singleNumber(int[] nums) {
        int resultNum = 0;
        for (int i = 0; i < nums.length; i++) {
            resultNum = resultNum ^ nums[i];
        }
        System.out.println(resultNum);
        return resultNum;
    }
*/

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> collect1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> collect2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> collect3 = collect1.stream().filter(e -> collect2.contains(e)).collect(Collectors.toList());
        int[] resultNum = new int[collect3.size()];
        for (int i = 0; i < collect3.size(); i++) {
            resultNum[i] = collect3.get(i);
        }
        System.out.println(resultNum);
        return resultNum;
    }
}
