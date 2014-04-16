package com.zf.util.key.dto;

import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;

/**
 * ³öÅÆ
 * @author zhoufeng
 *
 */
public class KEY_START_STOP extends HotKeyEntity{

	private JButton start ,  stop ;

	public KEY_START_STOP(JButton start , JButton stop) {
		super(new Point(670 , 563), YXSUtils.nextConstant()  ,KeyEvent.VK_F1 , "¿ªÊ¼/ÔÝÍ£");
		this.start = start ;
		this.stop = stop ;
	}

	@Override
	public void execute() {
		if(start.isEnabled())
			start.doClick();
		else if(stop.isEnabled())
			stop.doClick();
		
	}

}
