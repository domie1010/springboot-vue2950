package com.dao;

import com.entity.HuowuchuhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuchuhuoVO;
import com.entity.view.HuowuchuhuoView;


/**
 * 货物出货
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:11:54
 */
public interface HuowuchuhuoDao extends BaseMapper<HuowuchuhuoEntity> {
	
	List<HuowuchuhuoVO> selectListVO(@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);
	
	HuowuchuhuoVO selectVO(@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);
	
	List<HuowuchuhuoView> selectListView(@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);

	List<HuowuchuhuoView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);
	
	HuowuchuhuoView selectView(@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);
	
}
