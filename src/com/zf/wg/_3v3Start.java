package com.zf.wg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.zf.util.key.HotKeyEntity;
import com.zf.util.key.HotKeyManager;
import com.zf.util.key.dto.KEY_AUTO_MOVE;
import com.zf.util.key.dto.KEY_CHECK_ICON_POINT;
import com.zf.util.key.dto.KEY_CP;
import com.zf.util.key.dto.KEY_JN_1;
import com.zf.util.key.dto.KEY_JN_2;
import com.zf.util.key.dto.KEY_JN_3;
import com.zf.util.key.dto.KEY_JN_4;
import com.zf.util.key.dto.KEY_LC_QN;
import com.zf.util.key.dto.KEY_LC_XP;
import com.zf.util.key.dto.KEY_LC_ZDXP;
import com.zf.util.key.dto.KEY_SB;
import com.zf.util.key.dto.KEY_SHOW_HIDE;
import com.zf.util.key.dto.KEY_START_STOP;
import com.zf.util.key.dto.KEY_ZB_1;
import com.zf.util.key.dto.KEY_ZB_2;
import com.zf.util.key.dto.KEY_ZB_3;
import com.zf.util.key.dto.KEY_ZB_4;
import com.zf.util.key.dto.KEY_ZB_LC_QD;
import com.zf.util.key.dto._3v3.KEY_OU_1;
import com.zf.util.key.dto._3v3.KEY_OU_2;
import com.zf.util.key.dto._3v3.KEY_OU_3;
import com.zf.util.key.dto._3v3.KEY_OU_4;
import com.zf.util.key.dto._3v3.KEY_OU_5;

public class _3v3Start extends JFrame{

	private static final long serialVersionUID = 6754352128988450562L;
	private final JButton start = new JButton("开始") ;
	private final JButton stop = new JButton("停止") ;
	private final JTextArea jta = new JTextArea(10 , 20) ;
	private long logCount  = 0 ;   
	private final JButton yujiStart = new JButton("YJStart");
	private final JButton yujiEnd = new JButton("YJStop");
	public static Boolean yujiIsStart  = false ;
	
	public static final HotKeyEntity KEY_CP = new KEY_CP();
	public static final HotKeyEntity KEY_CHECK_ICON_POINT = new KEY_CHECK_ICON_POINT();
	public static final HotKeyEntity KEY_ZB_1 = new KEY_ZB_1();
	public static final HotKeyEntity KEY_ZB_2 = new KEY_ZB_2();
	public static final HotKeyEntity KEY_ZB_3 = new KEY_ZB_3();
	public static final HotKeyEntity KEY_ZB_4 = new KEY_ZB_4();
	public static final HotKeyEntity KEY_OU_1 = new KEY_OU_1();
	public static final HotKeyEntity KEY_OU_2 = new KEY_OU_2();
	public static final HotKeyEntity KEY_OU_3 = new KEY_OU_3();
	public static final HotKeyEntity KEY_OU_4 = new KEY_OU_4();
	public static final HotKeyEntity KEY_OU_5 = new KEY_OU_5();
	public static final HotKeyEntity KEY_JN_1 = new KEY_JN_1();
	public static final HotKeyEntity KEY_JN_2 = new KEY_JN_2();
	public static final HotKeyEntity KEY_JN_3 = new KEY_JN_3();
	public static final HotKeyEntity KEY_JN_4 = new KEY_JN_4();
	public static final HotKeyEntity KEY_SB = new KEY_SB();
	public static final HotKeyEntity KEY_ZB_LC_QD = new KEY_ZB_LC_QD();
	public static final HotKeyEntity KEY_AUTO_MOVE = new KEY_AUTO_MOVE();
	public static final HotKeyEntity KEY_LC_XP = new KEY_LC_XP();
	public static final HotKeyEntity KEY_LC_QN = new KEY_LC_QN();
	public static final HotKeyEntity KEY_LC_ZDXP = new KEY_LC_ZDXP();
	public static  HotKeyEntity KEY_SHOW_HIDE ;
	public static KEY_START_STOP KEY_START_STOP  ;
	
	private HotKeyManager hkm = new HotKeyManager();
	
	public void initKeys(){
		hkm.getHotkeys().add(KEY_CP);
		hkm.getHotkeys().add(KEY_CHECK_ICON_POINT);
		hkm.getHotkeys().add(KEY_ZB_1);
		hkm.getHotkeys().add(KEY_ZB_2);
		hkm.getHotkeys().add(KEY_ZB_3);
		hkm.getHotkeys().add(KEY_ZB_4);
		hkm.getHotkeys().add(KEY_OU_1);
		hkm.getHotkeys().add(KEY_OU_2);
		hkm.getHotkeys().add(KEY_OU_3);
		hkm.getHotkeys().add(KEY_OU_4);
		hkm.getHotkeys().add(KEY_OU_5);
		hkm.getHotkeys().add(KEY_JN_1);
		hkm.getHotkeys().add(KEY_JN_2);
		hkm.getHotkeys().add(KEY_JN_3);
		hkm.getHotkeys().add(KEY_JN_4);
		hkm.getHotkeys().add(KEY_SB);  
		hkm.getHotkeys().add(KEY_ZB_LC_QD);  
		hkm.getHotkeys().add(KEY_AUTO_MOVE);  
		hkm.getHotkeys().add(KEY_LC_XP);  
		hkm.getHotkeys().add(KEY_LC_QN);  
		hkm.getHotkeys().add(KEY_LC_ZDXP);  
		
		KEY_SHOW_HIDE = new KEY_SHOW_HIDE(this);
		KEY_START_STOP = new KEY_START_STOP(start , stop);
		
		hkm.getDefaultKeys().add(KEY_SHOW_HIDE);
		hkm.getDefaultKeys().add(KEY_START_STOP);
	}
	

	public _3v3Start(){
		initKeys() ;
		init();
		addYjStartBut();
		addYjEndBut();
		addStartButton();
		addStopButton() ;
		addClearButton();
		addLogArea();
		setVisible(true);
		hkm.initDefaultKeys();	//初始化默认的key
	}


	public void init(){
		setBounds(0, 0, 300, 700);
		setLayout(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void startAction(){
		hkm.initHotKey();
		start.setEnabled(false);
		stop.setEnabled(true);
	}
	
	public void stopAction(){
		hkm.destory() ;
		start.setEnabled(true);
		stop.setEnabled(false);
	}
	
	public void addStartButton(){
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startAction();
			}
		});
		start.setBounds(15 , 10 , 60, 30);
		add(start);
	}
	
	public void addStopButton(){
		stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopAction();
			}
		});
		stop.setEnabled(true);
		stop.setBounds(90 , 10 , 60, 30);
		add(stop);
	}

	public void addClearButton(){
		final JButton clear = new JButton("清除日志") ;
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
			}
		});
		clear.setBounds(180 , 10 , 90, 30);
		add(clear);
	}
	
	public void addYjStartBut(){
		yujiStart.setBounds(15 , 580 , 80, 30);
		yujiStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yujiIsStart = true ;
				yujiStart.setEnabled(false);
				yujiEnd.setEnabled(true);
			}
		});
		add(yujiStart);
	}
	
	public void addYjEndBut(){
		yujiEnd.setBounds(110 , 580 , 80, 30);
		yujiEnd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yujiIsStart = false ;
				yujiStart.setEnabled(true);
				yujiEnd.setEnabled(false);
			}
		});
		add(yujiEnd);
	}

	public void addLogArea(){
		final JScrollPane jsp = new JScrollPane(jta);
		jsp.setBounds(30, 70, 250 , 500 );
		add(jsp);  
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){      
					try {
						jta.append(HotKeyManager.log.take() + "\n") ;
						logCount++ ;
						if(logCount % 25 == 0){
							jta.setText("");
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public static void main(String[] args) {

		new _3v3Start();


	}

}
