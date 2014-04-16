package com.zf.util.key.dto;

import java.awt.Point;

import com.zf.util.ImageUtils;
import com.zf.util.YXSContext;
import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;
import com.zf.wg._3v3Start;

/**
 * 检测游戏的位置
 * @author zhoufeng
 *
 */
public class KEY_CHECK_ICON_POINT extends HotKeyEntity{
	
	private KeyTools keytools = KeyTools.getInstance() ;

	private ImageUtils iu = new ImageUtils() ;
	
	public KEY_CHECK_ICON_POINT() {
		super(new Point(433, 703 ) ,YXSUtils.nextConstant()  ,(int)'B',"检测坐标");
	}
	
	@Override
	public void execute() {
		YXSContext.iconPoint = iu.getDefaultImgPoint() ;
		try {
			resetZBKeys();
			String point = YXSContext.iconPoint == null ?
					"失败" : "成功,point[" + 
					YXSContext.iconPoint .x + "," + YXSContext.iconPoint .y
					+ "]" ;
			HotKeyManager.log.put("操作：" + opreationName +point);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void resetZBKeys(){
		_3v3Start.KEY_ZB_1.point = keytools.fym() ;
		_3v3Start.KEY_ZB_2.point = keytools.jgm();
		_3v3Start.KEY_ZB_3.point = keytools.yry() ;
		_3v3Start.KEY_ZB_4.point = keytools.wq() ;
		
		_3v3Start.KEY_OU_1.point = keytools.on1() ;
		_3v3Start.KEY_OU_2.point = keytools.on2() ;
		_3v3Start.KEY_OU_3.point = keytools.on3() ;
		_3v3Start.KEY_OU_4.point = keytools.on4() ;
		_3v3Start.KEY_OU_5.point = keytools.on5() ;
		
		_3v3Start.KEY_JN_1.point = keytools.jn1() ;
		_3v3Start.KEY_JN_2.point = keytools.jn2() ;
		_3v3Start.KEY_JN_3.point =  keytools.jn3() ;
		_3v3Start.KEY_JN_4.point =  keytools.jn4() ;
		
		_3v3Start.KEY_ZB_LC_QD.point =  keytools.lc_qd() ;
		
		_3v3Start.KEY_CP.point = keytools.kg() ;
		
	}
	
	
	
}
