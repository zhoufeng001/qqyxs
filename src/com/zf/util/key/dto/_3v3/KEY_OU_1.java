package com.zf.util.key.dto._3v3;

import java.awt.Point;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;

/**
 * 另外的玩家1
 * @author zhoufeng
 *
 */
public class KEY_OU_1 extends HotKeyEntity {

	public KEY_OU_1() {
		//387 ,456
		super(new Point(387 ,430), YXSUtils.nextConstant()
				, (int)'Q' , "玩家1" );
	}

}
