package com.zf.util.key;

import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import com.zf.wg._3v3Start;

public class HotKeyManager implements HotkeyListener{

	public static final int MOUSE_LEFT = InputEvent.BUTTON1_MASK ;	//鼠标左键
	public static final int MOUSE_RIGHT = InputEvent.BUTTON3_MASK ;	//鼠标右键
	//记录日志
	public static final BlockingQueue<String> log = new LinkedBlockingQueue<String>();


	private List<HotKeyEntity> hotkeys ;
	
	private List<HotKeyEntity> defaultKeys ;
	
	public HotKeyManager(){
		JIntellitype.getInstance().addHotKeyListener(this);
	}

	@Override
	public void onHotKey(int key) {
		
		for (HotKeyEntity hke : defaultKeys) {  
			if(hke.bs == key){
				hke.execute();
				break ;
			}
		}
		for (HotKeyEntity hke : hotkeys) {  
			if(hke.bs == key){
				hke.execute();
				break ;
			}
		}
	}
	
	public void destory(){
		for (HotKeyEntity hke : hotkeys) {
			if(hke.bs != _3v3Start.KEY_START_STOP.bs)	//不为取消/暂停就移除
				JIntellitype.getInstance().unregisterHotKey(hke.bs);
		}
//		JIntellitype.getInstance().removeHotKeyListener(this);	
	}

	public void initDefaultKeys(){
		for (HotKeyEntity hke : defaultKeys) {
			JIntellitype.getInstance().registerHotKey( hke.bs ,
					0, hke.hotkey );
		}
//		JIntellitype.getInstance().addHotKeyListener(this);
	}


	public void initHotKey(){
		for (HotKeyEntity hke : hotkeys) {
			JIntellitype.getInstance().registerHotKey( hke.bs ,
					0, hke.hotkey );
		}
//		JIntellitype.getInstance().addHotKeyListener(this);
	}

	public List<HotKeyEntity> getHotkeys() {
		if(hotkeys == null)
			hotkeys = new ArrayList<HotKeyEntity>() ;
		return hotkeys;
	}

	public List<HotKeyEntity> getDefaultKeys() {
		if(defaultKeys == null)
			defaultKeys = new ArrayList<HotKeyEntity>() ;
		return defaultKeys;
	}

	
}
