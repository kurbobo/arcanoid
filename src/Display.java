/**
 * Created by Alexandr on 21.06.2017.
 */
import javax.swing.*;
public class Display {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arcade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.add(new Main(frame));
        frame.setVisible(true);
    }
}
