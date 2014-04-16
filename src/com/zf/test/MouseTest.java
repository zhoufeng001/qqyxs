package com.zf.test ;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import com.zf.util.YXSMouseListener;
import com.zf.util.YXSRobot;

public class MouseTest {

	public static void main(String[] args) throws Exception {

		JFrame frame = new JFrame(" Û±Í≤‚ ‘");
		frame.setVisible(true);
		frame.setBounds(30, 30, 50, 50);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;


		final YXSRobot robot = YXSRobot.getInstance() ;


		frame.addMouseListener(new YXSMouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				robot.mouseMove(500, 500);
				robot.pressMouse(InputEvent.BUTTON3_MASK) ;
			}
		}) ;

	}

}
