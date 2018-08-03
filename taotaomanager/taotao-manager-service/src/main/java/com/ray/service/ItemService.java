package com.ray.service;

import com.ray.pojo.TbItem;
import org.springframework.stereotype.Service;


public interface ItemService {

    TbItem getItemById(long itemId);


}
