package mecanografia;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class Mecanografia extends JFrame implements KeyListener {
    
    String s="";
    JLabel j = new JLabel(s);
    
    public Mecanografia(){
        add(j,BorderLayout.CENTER);
        addKeyListener(this);
    }
    
    public static void main(String[] args){
        Mecanografia m = new Mecanografia();
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setSize(300,75);
        m.setVisible(true);
    }
    public void keyPressed(KeyEvent e){ 
       s = s + e.getKeyChar();
       j.setText(s);
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }


    
}
