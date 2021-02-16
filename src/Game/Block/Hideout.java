package Game.Block;

import Game.Basic.GObj;
import Game.Basic.Ver2;
import Game.Options;

import javax.swing.*;
import java.awt.*;

public class Hideout extends GObj {

    public Image img;

    public Hideout(int x, int y){
        super(new Ver2(x,y), new Ver2(new ImageIcon(Options.DEFHDAW).getImage().getWidth(null), new ImageIcon(Options.DEFHDAW).getImage().getHeight(null)));
        img = new ImageIcon(Options.DEFHDAW).getImage();
    }

    public Hideout(int x, int y, String path){
        super(new Ver2(x,y), new Ver2(new ImageIcon(path).getImage().getWidth(null), new ImageIcon(path).getImage().getHeight(null)));
        img = new ImageIcon(path).getImage();
    }

    public void draw(Graphics g){
        g.drawImage(img,pos.x,pos.y,size.x,size.y,null);
    }
}
