package com.zf.util.key.dto;

import java.awt.Point;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;

/**
 * 进攻马
 * @author zhoufeng
 *
 */
public class KEY_ZB_2 extends HotKeyEntity{

	public KEY_ZB_2() {
		super(new Point(359, 703 ),YXSUtils.nextConstant()  , (int)'S' ,"进攻马");
	}
	
}
