package com.example.practice.conroller;

import com.example.practice.pojo.Goods;
import com.example.practice.service.GoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: chunyan.li
 * @time: 2023/5/26 15:21
 */
@Api(tags = "商品信息控制类")
@RestController
@RequestMapping("/goods")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @ApiOperation("商品信息分页查询")
    @GetMapping("/selectGoodsByPage")
    public List<Goods> selectGoodsByPage(@ApiParam("商品名") String goodName){
        List<Goods> goodsList= goodService.findGoodsVo();
        return goodsList;
    }

    @PostMapping("/selectGoodsByPage1")
    public List<Goods> selectGoodsByPage1(){
        List<Goods> goodsList= goodService.findGoodsVo();
        return goodsList;
    }
}
