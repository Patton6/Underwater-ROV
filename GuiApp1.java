import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GuiApp1 {
    
    public static void main(String[] args) {
        new GuiApp1();
    }

public GuiApp1()
    {
        JFrame guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("TJ-ROV");
        guiFrame.setSize(1920,1080);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        
        //Options for the JComboBox 
        String[] fruitOptions = {"Apple", "Apricot",};
        Icon icon = new ImageIcon("Horizontal.png");
        JLabel label = new JLabel("Full Name :", icon, JLabel.LEFT);

        //The first JPanel contains a JLabel and JCombobox
        final JPanel comboPanel = new JPanel();
        JLabel comboLbl = new JLabel("Fruits:");
        JComboBox fruits = new JComboBox(fruitOptions);
        
        comboPanel.add(comboLbl);
        comboPanel.add(fruits);
        
        JButton vegFruitBut = new JButton( "Reset");
        

        vegFruitBut.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
               comboPanel.setVisible(!comboPanel.isVisible());
            }
        });
        
        guiFrame.add(comboPanel, BorderLayout.NORTH);
        guiFrame.add(vegFruitBut,BorderLayout.SOUTH);
        getContentPane().add(label, BorderLayout.CENTER);
                
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
    
}