package com.example.practice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.practice.pojo.shuJuKu.Goods;

import java.util.List;

/**
 * @description:
 * @author: chunyan.li
 * @time: 2023/3/26 9:50
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * 获取商品列表
     * @return
     */
    List<Goods> findGoodsVo();
}
