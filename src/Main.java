import javax.swing.*;
import java.awt.*;

public class Main {

    public static JFrame frame; // Declaration of the frame

    public static void main(String[] args){
       Frame(); // Calling frame method
    }

    public static void Frame() { // Create new Frame and Components
        frame = new JFrame("Window"); // Create the new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setTitle("LivingUI");
        frame.setLayout(null);
        Components();
        frame.setVisible(true);
    }

    public static void Components(){ // Creates components for frame
        JButton Exit = new JButton("Exit");
        Exit.setBounds(1160,650,95,30);
        frame.add(Exit);
    }
}


