package com.ray.service.impl;

import com.ray.mapper.TbItemMapper;
import com.ray.pojo.TbItem;
import com.ray.pojo.TbItemExample;
import com.ray.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        /* 第一种: 根据主键查询*/
        // TbItem item = itemMapper.selectByPrimaryKey(itemId);

        /* 根据查询条件查询 */
        TbItemExample example = new TbItemExample();
        // 创建一个查询条件
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = tbItemMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            TbItem item = list.get(0);
            return item;

        }
        return null;
    }
}
