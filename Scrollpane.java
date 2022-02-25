import javax.swing.*;
import java.awt.*;
public  class Scrollpane extends JFrame {
    JScrollPane scrollpanal;
    public Scrollpane(){
        String player[]={"Virat","Rohit","Chahal","Hardik","Dhoni ",
        "Jadeja","ayyer","Pant"};
        JList list = new JList(player);
        JScrollPane scrollpane = new JScrollPane(list);
        Object BorderLaout;
        getContentPane().add(scrollpane,BorderLayout.CENTER);
    
    }
    
    
    public static void main(String[] args) {
        setFrame(new Scrollpane(),300,200);
    }
    public static void 
    setFrame(final JFrame frame,final int width,final int height){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frame.setTitle(frame.getClass().getSimpleName());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }    
        });
    }
    
}
