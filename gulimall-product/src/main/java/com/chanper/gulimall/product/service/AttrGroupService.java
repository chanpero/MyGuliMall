package com.chanper.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chanper.common.utils.PageUtils;
import com.chanper.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chanper
 * @email qianchaosolo@gmail.com
 * @date 2023-03-09 13:23:18
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

