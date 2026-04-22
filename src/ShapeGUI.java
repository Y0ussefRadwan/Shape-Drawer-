// ا Swing (JFrame, JPanel, ...)
import javax.swing.*;

import java.awt.*;


public class ShapeGUI extends JPanel {
    
    private Drawable[] shapes;

    public ShapeGUI(Drawable[] shapes)
    {
    	this.shapes=shapes;
    }
    
        
        @Override
        protected void paintComponent(Graphics g) {
             
            int x = 20;
            int y = 50;
            int scale=4;
            for (Drawable d : shapes) {
                
                if (d == null) continue;

                // ===================== circle =====================
                if (d instanceof Circle) {
                    
                	
                    Circle c = (Circle) d;
                    int radius = (int) (c.getRadius()*scale);     
                    
                    g.setColor(Color.black);
                    g.fillOval(x, y, radius * 2, radius * 2);
                    g.drawString("Circle ()", x, y - 5);
                    
                    x += (radius * 2) + 20;
                    
                    
               // ===================== cube =====================
                    
                } else if (d instanceof Cube) {
                    Cube cube = (Cube) d;
                    int s = (int) (cube.getSide() * scale);
                    int shift = 30; 
                    g.setColor(Color.BLUE);
                    g.drawRect(x, y, s, s); 
                    g.drawRect(x + shift, y + shift, s, s); 
                    g.drawLine(x, y, x + shift, y + shift); 
                    g.drawLine(x + s, y + s, x + s + shift, y + s + shift); 
                    g.drawLine(x + s, y, x + s + shift, y + shift); 
                    g.drawLine(x, y + s, x + shift, y + s + shift); 
                    g.drawString("Cube ()", x, y - 5);
                    x+=s+50+shift;
                }
                
            
            }
        }
    }

