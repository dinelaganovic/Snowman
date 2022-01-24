import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class snesko extends Canvas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame("zima");
		  Canvas canvas = new snesko();
		  frame.add(canvas);
		  frame.pack();
		  frame.setSize(400, 400);
		  frame.setVisible(true);
	}
	
	public void paint(Graphics page)
	 {
	 final int MID = 150;
	 final int TOP = 50;
	 
	 
	 setBackground(Color.lightGray); // boji pozadinu u plavo
	 
	 page.setColor(Color.blue); // crtamo pod
	 page.fillRect(20, 175, 300, 50);
	 
	 page.setColor(Color.yellow); // crtamo sunce
	 page.fillOval(-40, -40, 80, 80);
	 
	 page.setColor(Color.white);
	 page.fillOval(MID-20, TOP, 40, 40);
	 page.fillOval(MID-35, TOP+35, 70, 50);
	 page.fillOval(MID-50, TOP+80, 100, 60);
	 
	 
	 page.setColor(Color.black);
	 page.fillOval(MID-10, TOP+10, 5, 5);
	 page.fillOval(MID+5, TOP+10, 5, 5);
	 
	 page.drawArc(MID-10, TOP+20, 20, 10, 190, 160);//usta
	 
	 page.drawLine(MID-25, TOP+60, MID-50,TOP+40);//leva ruka
	 page.drawLine(MID+25, TOP+60, MID+55,TOP+60); //desna ruka
	 
	 page.setColor(Color.red);
	 page.drawLine(MID-20, TOP+5, MID+20, TOP+5);//linija za kapu
	 page.fillRect(MID-15, TOP-20, 30, 25);// kapa
	 
	 }


}
