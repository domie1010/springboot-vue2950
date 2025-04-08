package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowuchuhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowuchuhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowuchuhuoView;


/**
 * 货物出货
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:11:54
 */
public interface HuowuchuhuoService extends IService<HuowuchuhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowuchuhuoVO> selectListVO(Wrapper<HuowuchuhuoEntity> wrapper);
   	
   	HuowuchuhuoVO selectVO(@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);
   	
   	List<HuowuchuhuoView> selectListView(Wrapper<HuowuchuhuoEntity> wrapper);
   	
   	HuowuchuhuoView selectView(@Param("ew") Wrapper<HuowuchuhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowuchuhuoEntity> wrapper);
   	
}

