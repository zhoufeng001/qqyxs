package com.zf.util.key.dto;

import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import com.zf.util.YXSUtils;
import com.zf.util.key.HotKeyEntity;

/**
 * ≥ˆ≈∆
 * @author zhoufeng
 *
 */
public class KEY_SHOW_HIDE extends HotKeyEntity{
	
	private JFrame mainFrame ;

	public KEY_SHOW_HIDE(JFrame mainFrame) {
		super(new Point(670 , 563), YXSUtils.nextConstant()  ,KeyEvent.VK_F10,"œ‘ æ/”∞≤ÿ");
		this.mainFrame = mainFrame ;
	}
	
	@Override
	public void execute() {
		System.out.println("show/hide");
		mainFrame.setVisible(!mainFrame.isVisible() );
	}

}
