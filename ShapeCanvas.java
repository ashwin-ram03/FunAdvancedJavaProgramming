package ShapePack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

//CONCRETE CLASSES MUST BE ENTIRELY COMPLETE
public class ShapeCanvas extends AbstractShapeCanvas{
	@Override
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y = e.getY();
		repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
		x=arg0.getX();
		y = arg0.getY();
		repaint();
		
	}

	
	
}
//person implement "student", "teacher", etc. (Learned Traits : Humans). 
//programmer must be able to "implement" skills
  abstract class AbstractShapeCanvas extends JPanel implements MouseListener, MouseMotionListener{
  public int x, y;
  public void paintComponent(Graphics g) {
	  super.paintComponent(g);
	  g.setColor(new Color(255, 255, 255));
	  g.fillRect(0, 0, getWidth(), getHeight());
	  g.setColor(new Color(0, 0, 0));
	  g.drawString("Hello World!", x, y); //draws "Hello World" at specified position on white square
  }

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	x=arg0.getX();
	y = arg0.getY();
	repaint();
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	x = arg0.getX();
	y = arg0.getY();
	repaint(); //it won't update the screen WITHOUT THIS!
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}



  
}
