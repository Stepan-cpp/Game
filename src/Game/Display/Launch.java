package Game.Display;

import javax.swing.*;

public class Launch {
    public static void main(String[] args){
        JFrame frame = new JFrame("Game");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Display(frame));
        frame.setVisible(true);
    }
}
