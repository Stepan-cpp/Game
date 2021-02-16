package Game.Basic;

import java.awt.*;

public abstract class GObj {
    public Ver2 pos;
    public Ver2 size;

    public GObj(Ver2 position, Ver2 size){
        pos = position;
        this.size = size;
    }

    public abstract void draw(Graphics g);
}
