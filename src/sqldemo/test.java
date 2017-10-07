package sqldemo;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFrame frame = new SimpleFrame();
		Button b = new Button("按钮");// 在窗口中添加一个按钮；
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("奥数试卷生成系统");// 设置窗口标题内容
		frame.setSize(800, 400);// 设置窗口大小,宽度500，高度400
		frame.setLocation(300, 200);// 设置窗口位置为距离屏幕左边水平方向300，上方垂直方向200
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());// 设置窗体布局为流式布局。
		frame.add(b);// 将按钮添加到窗口内

		
		
//		Graphics g=new Graphics;
//		frame.paintComponent(g);
		
  ////  sqlQuery.sqlQuery();
    
    
//    //Graphics2D g2=(Graphics2D)g;
//    Graphics2D g2;
//    
//    String message="Hello World!";
//    Font f=new Font("Serif",Font.BOLD,36);
//   // g2.setFont(f);
	/*	
    Frame f = new Frame();//构造一个最初不可见的 Frame 新实例（）。
   
    f.setTitle("窗口——by星云");//设置窗口标题内容
    f.setSize(500, 400);//设置窗口大小,宽度500，高度400
    f.setLocation(300, 200);//设置窗口位置为距离屏幕左边水平方向300，上方垂直方向200
    f.setVisible(true);//设置窗体可见。
    f.setLayout(new FlowLayout());//设置窗体布局为流式布局。
    
    Button b=new Button("我是一个按钮");//在窗口中添加一个按钮；
    f.add(b);//将按钮添加到窗口内
    */
    
    
	}

}
