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
                    JDialog dialog = new JDialog();     
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setTitle("Product combination list");

                    dialog.add(new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream(IMAGE_URL)))));

                    dialog.pack();
                    dialog.setLocationByPlatform(true);
                    dialog.setVisible(true);
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
