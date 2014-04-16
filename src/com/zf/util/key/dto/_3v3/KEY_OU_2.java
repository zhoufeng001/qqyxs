package com.zf.util.key.dto._3v3;

import java.awt.Point;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;

/**
 * 另外的玩家2
 * @author zhoufeng
 *
 */
public class KEY_OU_2 extends HotKeyEntity {

	public KEY_OU_2() {
		super(new Point(520 , 164 ), YXSUtils.nextConstant()
				, (int)'W' , "玩家2" );
	}

}
