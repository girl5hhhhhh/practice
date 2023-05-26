package com.example.practice.serviceIml;

import com.example.practice.mapper.GoodsMapper;
import com.example.practice.pojo.shuJuKu.Goods;
import com.example.practice.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: chunyan.li
 * @time: 2023/5/26 15:20
 */
@Service
public class GoodServiceIml implements GoodService {

    @Autowired
    private GoodsMapper goodMapper;

    @Override
    public List<Goods> findGoodsVo() {
        return goodMapper.findGoodsVo();
    }
}
