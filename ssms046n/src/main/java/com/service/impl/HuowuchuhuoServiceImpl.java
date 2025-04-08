package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuowuchuhuoDao;
import com.entity.HuowuchuhuoEntity;
import com.service.HuowuchuhuoService;
import com.entity.vo.HuowuchuhuoVO;
import com.entity.view.HuowuchuhuoView;

@Service("huowuchuhuoService")
public class HuowuchuhuoServiceImpl extends ServiceImpl<HuowuchuhuoDao, HuowuchuhuoEntity> implements HuowuchuhuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowuchuhuoEntity> page = this.selectPage(
                new Query<HuowuchuhuoEntity>(params).getPage(),
                new EntityWrapper<HuowuchuhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowuchuhuoEntity> wrapper) {
		  Page<HuowuchuhuoView> page =new Query<HuowuchuhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowuchuhuoVO> selectListVO(Wrapper<HuowuchuhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowuchuhuoVO selectVO(Wrapper<HuowuchuhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowuchuhuoView> selectListView(Wrapper<HuowuchuhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowuchuhuoView selectView(Wrapper<HuowuchuhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
