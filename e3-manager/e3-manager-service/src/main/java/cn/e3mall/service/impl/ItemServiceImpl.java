package cn.e3mall.service.impl;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cw
 * @date 2019/4/23
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(long id){
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
