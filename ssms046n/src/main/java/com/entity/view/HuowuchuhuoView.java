package com.entity.view;

import com.entity.HuowuchuhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 货物出货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 14:11:54
 */
@TableName("huowuchuhuo")
public class HuowuchuhuoView  extends HuowuchuhuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuowuchuhuoView(){
	}
 
 	public HuowuchuhuoView(HuowuchuhuoEntity huowuchuhuoEntity){
 	try {
			BeanUtils.copyProperties(this, huowuchuhuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
