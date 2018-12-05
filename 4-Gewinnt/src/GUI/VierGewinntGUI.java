package GUI;


import BL.VierGewinntBL;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VierGewinntGUI extends JFrame{
    VierGewinntBL VgewinntBL = new VierGewinntBL();
    private boolean playerOne = true;

    public VierGewinntGUI() throws HeadlessException {
        super("VierGewinnt");
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
   
    
    }
  
    private void initComponents(){
          Container container = this.getContentPane();
        container.setLayout(new GridLayout(7,7,3,3));
        
            
        for(int i = 0; i < 7; ++i){     //Zeilen
            for(int j = 0; j < 7; ++j){ //Spalten    
              if(i == 0){
                  JButton b = new JButton();
                  b.setOpaque(true);
                  b.setText("?XD");
                  container.add(b);
                  
              }
           else{JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.BLACK);
                label.setForeground(Color.white);
                label.setHorizontalAlignment(JLabel.CENTER);
                //label.setText(i + "" + j);
                label.setName(i + "" + j);
                container.add(label);
              }  
            }
        }
    }
    
    public static void main(String[] args) {
            new VierGewinntGUI().setVisible(true);
        }
    }


