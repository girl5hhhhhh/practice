package com.example.practice.solution;

import java.util.Arrays;
import java.util.Collections;

/**
 * @description: 算法
 * @author: chunyan.li
 * @time: 2023/3/7 12:16
 */
public class Practice2 {
    public static void main(String[] args) {

//        int[] A = {1, 3, 6, 4, 1, 2};
//        System.out.println(solution(A));
//
//        String S = "Hello,World";
//        System.out.println(solution1(S));;
//
//        int[] a = {-5,-2,-5,10};
//        solution2(a);

        int[] nums = {4,1,2,1,2};
        System.out.println("异或结果" + solution3(nums));

    }


    public static int solution(int[] B) {
        Arrays.sort(B);
        for (int j = 0; j < B.length; j++) {
            if(B[j]+1 < B[j+1]){
                return B[j]+1;
            }
        }
        return B[0];
    }

    public static String solution1(String S) {
        String[] split = S.split("");
        Collections.reverse(Arrays.asList(split));
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : split) {
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static int[] solution2(int[] A) {
        // Implement your solution here
        return new int[]{1, 2};
    }

    public static int solution3(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++)
            result ^= A[i];
        return result;
    }
}
