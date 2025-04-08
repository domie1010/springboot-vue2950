package com.dao;

import com.entity.HuowuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuleixingVO;
import com.entity.view.HuowuleixingView;


/**
 * 货物类型
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:11:54
 */
public interface HuowuleixingDao extends BaseMapper<HuowuleixingEntity> {
	
	List<HuowuleixingVO> selectListVO(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	
	HuowuleixingVO selectVO(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	
	List<HuowuleixingView> selectListView(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);

	List<HuowuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	
	HuowuleixingView selectView(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	
}
