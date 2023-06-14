package com.example.practice;

import com.example.practice.mapper.GoodsMapper;
import com.example.practice.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class PracticeApplicationTests {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    void contextLoads() {
        List<Goods> list = goodsMapper.findGoodsVo();
        System.out.println(list);
    }
}
