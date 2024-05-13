package Comportamental.State.clase;

public class Ocupat implements AbstractState{
    @Override
    public void schibaStareLoc(Loc loc) {
        loc.setAbstractState(this);
    }
    protected Ocupat(){

    }
}
