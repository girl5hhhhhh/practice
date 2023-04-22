package com.example.practice;

import com.example.practice.mapper.GoodsMapper;
import com.example.practice.pojo.shuJuKu.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        //��������
        //int[] arr = {1,2,4,5,9,10};
        int[] arr = {1,2,3,4,7,9};
        List lost = new ArrayList<>();
        //����
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
        System.out.println("�ַ������Ƿ������ 'runoob' ���ַ���? " + "\n" +isMatch);
        System.out.println(isMatch);
    }

    //String pattern1 = ".\\[\\��[0-9]{4}[0-9]+��";
    @Test
    void test3(){
        String content1 = "[2020]0021��";
        String content2 = "��2020��0022��";
        String content3 = "���̶�ֲ��[2018]367��";
        String content4 = "�������ֵ�����2018��120��";

       /* String pattern1 = ".*(\\[|��).*��";
        boolean isMatch1 = Pattern.matches(pattern1, content1);

        String pattern2 = ".*(\\[|��).*��";
        boolean isMatch2 = Pattern.matches(pattern2, content2);*/

        String pattern3 = ".*(\\[|��).*(\\]|��).*��";
        boolean isMatch3 = Pattern.matches(pattern3, content4);

        System.out.println(isMatch3);
    }

    @Test
    void test4(){
        String s = "���̶�ֲ��[2018]321�Ű�������ռ2018A0044�оֲ��֡�2018��0724001����ռ2018A0080��2018��0168��";
        String regex = "\\d+"; // ƥ����������
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        String lastMatch = null;  // ���һ��ƥ����
        while (matcher.find()) {
            lastMatch = matcher.group();
        }
        if (lastMatch != null) {
            System.out.println(lastMatch);  // ������һ��ƥ����
        } else {
            System.out.println("δƥ�䵽����");
        }
    }


    @Test
    void test5(){
        //��������
        List<Integer> arr = Arrays.asList(1,2,4,7);
        List lost = new ArrayList<>();
        //����
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

}