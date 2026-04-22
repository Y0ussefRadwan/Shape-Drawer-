// ا File 
import java.io.File;
// _______________________________________
// Exception 
import java.io.FileNotFoundException;
import java.io.IOException;
//____________________________________
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Shape Drawer");

        Drawable[] shapes = null;
        
               
            File inputFile = new File("input.txt");
            
            if (!inputFile.exists()) {
                System.out.println("Error: input.txt not found.");
                return; 
            }

            Scanner scanner = new Scanner(inputFile);
            if (scanner.hasNextInt()) {
                int numShapes = scanner.nextInt();
                
                if (numShapes < 2) {
                    System.out.println("Minimum array size is 2. Setting to 2.\n");
                    return ;
                }
                
                shapes = new Drawable[numShapes];
                
                
                for (int i = 0; i <numShapes; i++) {
                    
                    if (scanner.hasNext()) {
                        
                        String type = scanner.next();
                        
                        if (scanner.hasNextDouble()) {
                            
                            double  value =/*Math.abs*/(scanner.nextDouble());
                            if(value<0)
                            {
                            	System.out.println("Error: please enter postive value : "+" "+type+"\n");
                            //	return;
                            }
                            
                             else if (type.equalsIgnoreCase("circle")) {
                                shapes[i] = new Circle("Black", value);
                                
                            } else if (type.equalsIgnoreCase("cube")) {
                                shapes[i] = new Cube("Blue", value);
                            }
                            
                            else {
                                System.out.println("Unknown shape type: " + type+" , please write(cube OR circle)\n");
                               //return;
                            }
                        }
                    
                }
            }
                
            }
            else {
            	
            	System.out.println("Error : please Enter  Integr of number Shape\n");
            	return;
            }
            
            scanner.close();
            
            // ===================== Total Areas =====================
            
            
            
            double totalArea = 0;
            if (shapes != null) {
                for (Drawable d : shapes) {
                    
                    
                	if (d instanceof Shape) {
                        
                        totalArea += ((Shape) d).getArea(); 
                        System.out.println(((Shape) d).toString());
        
                }
                }
            }
            
            // ===================== OutputFile =====================
            
            
            
            PrintWriter writer = new PrintWriter("sumAreas.txt");
            writer.println("Total Area: " + totalArea);
            writer.close();
            System.out.println("Total area written to sumAreas.txt");
            
            
            
            
            //------------>  GUI  <-----------------//
            
            frame.setSize(600, 400);
            frame.add(new  ShapeGUI(shapes)); 
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);


            

        }
    }
