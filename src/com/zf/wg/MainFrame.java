package com.zf.wg;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.zf.util.YXSMouseListener;
import com.zf.util.YXSRobot;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = -4994442045094675648L;
	private ArrayList<YXSMouseEvent> events = new ArrayList<YXSMouseEvent>();

	public MainFrame() throws Exception{
		setBounds(50, 50, 1240, 950);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		init();
		setVisible(true);
	}

	public void init() throws Exception{
		final YXSRobot robot = YXSRobot.getInstance() ;
		final JPanel mainPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				setOpaque(true);   
				super.paintComponent(g);
				BufferedImage img = null;
				try {
					img = ImageIO.read(MainFrame.class.getClassLoader().getResourceAsStream("resources/proxy.jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g.drawImage(img, 0	, 0, null);
			}
		};
//		mainPanel.setBackground(Color.red);
		mainPanel.setBounds(50	, 50, 1024, 734);

		mainPanel.addMouseListener(new YXSMouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) { 
				System.out.println(e.getButton());
				YXSMouseEvent yme = new YXSMouseEvent(e.getLocationOnScreen() , e.getButton()) ;
				events.add(yme);
			}
			
		}) ;

		this.add(mainPanel);

		JButton record = new JButton("开始记录") ;
		record.setBounds(10,10, 120, 30);
		record.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				events = null ;
				events = new ArrayList<YXSMouseEvent>();
			}
		});
		
		JButton run = new JButton("运行") ; 
		run.setBounds(150,10, 120, 30);
		run.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				for (YXSMouseEvent ye : events) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					robot.mouseMove((int)ye.point.x, (int)ye.point.y);
					robot.pressMouse(ye.button);     
				}
			}
		});



		this.add(record);
		this.add(run);
	}

	private static class YXSMouseEvent{

		Point point ;
		int button ;

		YXSMouseEvent(Point point, int button) {
			this.point = point;
			if(button == 1){
				this.button = InputEvent.BUTTON1_MASK ;
			}else if(button == 2){
				this.button = InputEvent.BUTTON3_MASK ;
			}
		}
		
		@Override
		public String toString() {
			return String.format("x:%d  y:%d button:%d", point.x , point.y , button);
		}

	}

	public static void main(String[] args) throws Exception {
		new MainFrame();
	}

}

