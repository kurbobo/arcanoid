import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * Created by Alexandr on 21.06.2017.
 */
public class Main extends JPanel implements ActionListener {
    Timer timer = new Timer(20, this);
    JFrame frame;
    static int d;
    Image img1 = new ImageIcon("h.jpg").getImage();
    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img1, 0, 0, null);
    }
    public Main(JFrame frame) {
        this.frame = frame;
        timer.start();
        frame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) {
                    d = -1;
                }
                if (key == KeyEvent.VK_RIGHT) {
                    d = 1;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                d = 0;
            }
        });

    }
    Image img = new ImageIcon("2.png").getImage();
    public void paint(Graphics g){
        g.drawImage(img, 0, 0, 1000, 500, null);
        Color newColor = new Color(0, 0, 255);
        g.setColor(newColor);
        g.fillOval(player.getX(), player.getY(), 20, 20);
        Color newColor1 = new Color(0, 100, 100);
        g.setColor(newColor1);
        g.fillRect(player.getD(), 420,player.getL() , 20);
        g.fillRect(player.getD(), 20, 340, 20);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if((player.getY()<410&&player.getY()>30)||(player.getX()>player.getD()&&player.getX()<player.getD()+player.getL()))
       {repaint(); player.play(d); }
        else { player.stop(); drawIcon();}

       // ((player.getY()>=410||player.getY()<=30&&(player.getX()<=player.getD()||player.getX()>=player.getD()+340)))



    }
    //-----------------------------------------------------------
    Player player=new Player();

}
