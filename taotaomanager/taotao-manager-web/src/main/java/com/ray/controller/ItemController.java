package com.ray.controller;

import com.ray.pojo.TbItem;
import com.ray.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 
 *
 * 
 * @Title: ItemController
 * @description:  Controller of Item
 * @author liujun
 * @create 2018-08-02
 * @Version 1.0
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemid}")
    @ResponseBody
    public TbItem getItemById(@PathVariable(value = "itemid") Long itemid){
        TbItem tbItem = itemService.getItemById(itemid);
        return tbItem;
    }
}
