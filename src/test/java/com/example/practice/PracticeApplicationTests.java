package com.example.practice;

import com.example.practice.mapper.GoodsMapper;
import com.example.practice.pojo.shuJuKu.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class PracticeApplicationTests {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    void contextLoads() {
        List<Goods> list = goodsMapper.findGoodsVo();
        System.out.println(list);
    }
    @Test
    void test1(){
        //升序排序
        //int[] arr = {1,2,4,5,9,10};
        int[] arr = {1,2,3,4,7,9};
        List lost = new ArrayList<>();
        //处理
        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i+1]-arr[i])!=1){
                int num = arr[i+1]-arr[i];
                for (int j = 1; j < num; j++) {
                    //System.out.println();
                    lost.add(arr[i]+j);
                }
            }
        }
        System.out.println(lost);
    }

    @Test
    void test2(){
        String content = "I am noob from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + "\n" +isMatch);
        System.out.println(isMatch);
    }

    //String pattern1 = ".\\[\\【[0-9]{4}[0-9]+号";
    @Test
    void test3(){
        String content1 = "[2020]0021号";
        String content2 = "【2020】0022号";
        String content3 = "京绿动植许[2018]367号";
        String content4 = "京绿资林地许【2018】120号";

       /* String pattern1 = ".*(\\[|【).*号";
        boolean isMatch1 = Pattern.matches(pattern1, content1);

        String pattern2 = ".*(\\[|【).*号";
        boolean isMatch2 = Pattern.matches(pattern2, content2);*/

        String pattern3 = ".*(\\[|【).*(\\]|】).*号";
        boolean isMatch3 = Pattern.matches(pattern3, content4);

        System.out.println(isMatch3);
    }

    @Test
    void test4(){
        String s = "京绿动植许[2018]321号阿萨德永占2018A0044市局采字【2018】0724001号临占2018A0080【2018】0168号";
        String regex = "\\d+"; // 匹配任意数字
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        String lastMatch = null;  // 最后一个匹配项
        while (matcher.find()) {
            lastMatch = matcher.group();
        }
        if (lastMatch != null) {
            System.out.println(lastMatch);  // 输出最后一个匹配项
        } else {
            System.out.println("未匹配到数字");
        }
    }


    @Test
    void test5(){
        //升序排序
        List<Integer> arr = Arrays.asList(1,2,4,7);
        List lost = new ArrayList<>();
        //处理
        for (int i = 0; i < arr.size()-1; i++) {
            if((arr.get(i+1) - arr.get(i))!=1){
                int num = arr.get(i+1) - arr.get(i);
                for (int j = 1; j < num; j++) {
                    lost.add(arr.get(i)+j);
                }
            }
        }
        System.out.println(lost);
    }

    /*比较版本号输入 1.0.2.1 和 1.2.3.1.0
      前者大 返回1 相等返回0 后者大返回-1*/
    @Test
    void test6(){
        String version1 = "1.0.2.1.1";
        String version2 = "1.0.2.1";
        int flag = compareVersion(version1,version2);
        System.out.println(flag);
    }

    /*
    * UnsupportedOperationException
    * https://blog.csdn.net/lp840312696/article/details/120827780
    * */
    private int compareVersion(String version1, String version2) {
        List<String> split1 = new ArrayList<>(Arrays.asList(version1.split("\\.")));
        List<String> split2 = new ArrayList<>(Arrays.asList(version2.split("\\.")));

        //给length小的补0
        int count = Math.abs(split1.size() - split2.size());
        int size1 = split1.size();
        int size2 = split2.size();
        if(size1 < size2){
            for (int i = 0; i < count; i++) {
                split1.add("0");
            }
        }else {
            for (int i = 0; i < count; i++) {
                split2.add("0");
            }
        }

        int flag = 0;
        for (int i = 0; i < split1.size(); i++) {
            if (Integer.parseInt(split1.get(i)) > Integer.parseInt(split2.get(i))){
                flag = 1;
                break;
            }else if(Integer.parseInt(split1.get(i)) < Integer.parseInt(split2.get(i))){
                flag = -1;
                break;
            }else {
                flag = 0;
                continue;
            }
        }
        return flag;
    }

    @Test
    void test7(){

    }
}
