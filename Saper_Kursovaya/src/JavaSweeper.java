import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class JavaSweeper extends JFrame {

    private JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 5;
    private final int IMAGE_SIZE = 50;
    public static void main(String [] args){
        new JavaSweeper().setVisible(true);
    }
    private JavaSweeper(){
        initPanel();
        initFrame();

    }
    private void initPanel(){
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"),100,20,this);
                g.drawImage(getImage("icon"),10,20,this);
                g.drawImage(getImage("num1"),0,0,this);

            }
        };

        panel.setPreferredSize(new Dimension(COLS*IMAGE_SIZE,ROWS*IMAGE_SIZE));
        add(panel);
    }
    private void initFrame (){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saper Kursovaya");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private Image getImage(String name){
        String filename = "img/"+name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon (getClass().getResource(filename));
        return icon.getImage();
    }
}
