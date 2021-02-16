package Game.Entity;

import Game.Basic.GObj;
import Game.Basic.Ver2;

public abstract class Entity extends GObj {
    private Ver2 vel = new Ver2();
    public Entity(Ver2 pos, Ver2 size){
        super(pos,size);
        vel.x = 0;
        vel.y = 0;
    }

    public abstract void physics();
}
