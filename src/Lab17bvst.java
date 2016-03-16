import java.awt.*;
import java.applet.*;

public class Lab17bvst extends Applet
{		
	public void paint (Graphics g)
	{
		drawSquare1(g,1024,768);
	}
	
	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/4;
		int startHeight = maxY/4;
		int tlX = midX - (startWidth/2);
		int tlY = midY - (startHeight/2);
		g.fillRect(tlX,tlY,startWidth,startHeight);
		draw4Squares(g);
	}
	
	public void draw4Squares(Graphics g){
		drawNE(g, 640, 192, 128, 96);
		drawSE(g, 640, 480, 128, 96);
		drawNW(g, 256, 192, 128, 96);
		drawSW(g, 256, 480, 128, 96);
	}
	
	public void drawNE(Graphics g, int startX, int startY, int width, int height){
		
		g.fillRect(startX, startY, width, height);
		if( width >= 1 && height >= 1){
		drawNE(g, startX + width, startY - height/2, width/2, height/2);
		}
	}
	
	public void drawSE(Graphics g, int startX, int startY, int width, int height){
		
		g.fillRect(startX, startY, width, height);
		if( width >= 1 && height >= 1){
			drawSE(g, startX + width, startY + height, width/2, height/2);
		}
	}
	
	
	public void drawNW(Graphics g, int startX, int startY, int width, int height){
		
		g.fillRect(startX, startY, width, height);
		if ( width >= 1 && height >= 1){
			drawNW(g, startX - width/2, startY - height/2, width/2, height/2);
		}
	}
	
	public void drawSW(Graphics g, int startX, int startY, int width, int height){
		g.fillRect(startX, startY, width, height);
		if ( width >= 1 && height >= 1){
			drawSW(g, startX - width/2, startY + height, width/2, height/2);
		}	
	}
	
	public void delay(long n)
	{
		n *= 2000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}			
}
