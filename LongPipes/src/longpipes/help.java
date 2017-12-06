/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author up834615
 */
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class help 
{
    //set the path for the image location. 
    private static final String IMAGE_URL = "/image/matrix.png";

    
    public static void main(String[] args) 
    {
        createAndShowGUI();
    }

    
    public static void createAndShowGUI()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run() 
            {
                
                try
                {
                    //create new dialog box
                    JDialog dialog = new JDialog();     
                    //when user clicks cross the dialog box automatically closes. 
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    //sets title of dialog box. 
                    dialog.setTitle("Product combination list");
                    //adds image to jlabel so that an image print out on the dialog box. 
                    dialog.add(new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream(IMAGE_URL)))));
                    //fills the dialog box with the image
                    dialog.pack();
                    dialog.setLocationByPlatform(true);
                    //show the dialog box. 
                    dialog.setVisible(true);
                } 
                catch (IOException e) 
                {
                    //print error
                    e.printStackTrace();
                }
            }
        });
    }
}
