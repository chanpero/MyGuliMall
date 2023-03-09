package com.chanper.gulimall.ware.dao;

import com.chanper.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chanper
 * @email qianchaosolo@gmail.com
 * @date 2023-03-09 21:00:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
