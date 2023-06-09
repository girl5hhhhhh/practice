package com.example.practice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: 商品信息
 * @author chunyan.li
 * @since 2022-08-02
 */
@ApiModel("商品实体类")
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @ApiModelProperty("商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String goodsName;

    /**
     * 商品标题
     */
    @ApiModelProperty("商品标题")
    private String goodsTitle;

    /**
     * 商品图片
     */
    @ApiModelProperty("商品图片")
    private String goodsImg;

    /**
     * 商品详情
     */
    @ApiModelProperty("商品详情")
    private String goodsDetail;

    /**
     * 商品价格
     */
    @ApiModelProperty("商品价格")
    private BigDecimal goodsPrice;

    /**
     * 商品库存，-1表示没有限制
     */
    @ApiModelProperty("商品库存")
    private Integer goodsStock;


}
