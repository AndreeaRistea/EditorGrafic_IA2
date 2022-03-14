package data;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.naming.Context;
import javax.print.attribute.AttributeSet;
public class Dreapta extends FiguraGeometrica
{
	Punct a, b;
	public Dreapta()
	{
		a = new Punct();
		b = new Punct();
	}
	public void paint(Graphics g)
	{
		//a.citireCoordonate();
		//b.citireCoordonate();
		int r1,g1,b1;
		g.drawLine(0,0,20,20);
		
		 r1 = ( int )( Math.random() * 256 );
	     g1 = ( int )( Math.random() * 256 );
	     b1 = ( int )( Math.random() * 256 );
	     
	     g.setColor(new Color(r1,g1,b1));
	}

}
