package Game.Display;

import Game.Basic.GObj;
import Game.Block.Hideout;
import Game.Entity.Player;
import Game.Options;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Display extends JPanel implements ActionListener {

    private final Image map = new ImageIcon(Options.MAPPATH).getImage();

    private final JFrame frame;

    private final ArrayList<GObj> fl = new ArrayList<>(); // FIRST LAYER
    private final ArrayList<GObj> sl = new ArrayList<>(); // SECOND LAYER
    private final ArrayList<GObj> tl = new ArrayList<>(); // THIRD LAYER

    private Timer timer = new Timer(50, this);

    public Display(JFrame frame){
        this.frame = frame;
        tl.add(new Hideout(10,10));
        sl.add(new Player(100,100));
    }

    public void paint(Graphics g){
        //MAP
        g.drawImage(map,0,0,frame.getWidth(),frame.getHeight(),null);

        //FIRST LAYER TODO add objects first
        for(GObj o : fl){
            o.draw(g);
        }

        //SECOND LAYER TODO add objects second
        for(GObj o : sl){
            o.draw(g);
        }

        //THIRD LAYER
        for(GObj o : tl){
            o.draw(g);
        }
    }

    public void actionPerformed(ActionEvent e){

    }
}
