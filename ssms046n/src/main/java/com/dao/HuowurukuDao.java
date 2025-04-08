package com.dao;

import com.entity.HuowurukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowurukuVO;
import com.entity.view.HuowurukuView;


/**
 * 货物入库
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:11:54
 */
public interface HuowurukuDao extends BaseMapper<HuowurukuEntity> {
	
	List<HuowurukuVO> selectListVO(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	HuowurukuVO selectVO(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	List<HuowurukuView> selectListView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);

	List<HuowurukuView> selectListView(Pagination page,@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	HuowurukuView selectView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
}
