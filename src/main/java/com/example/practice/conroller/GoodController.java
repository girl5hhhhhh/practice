package com.example.practice.conroller;

import com.example.practice.pojo.Goods;
import com.example.practice.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: chunyan.li
 * @time: 2023/5/26 15:21
 */
@RestController
@RequestMapping("/goods")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping("/selectGoodsByPage")
    public List<Goods> selectGoodsByPage(){
        List<Goods> goodsList= goodService.findGoodsVo();
        return goodsList;
    }
}
