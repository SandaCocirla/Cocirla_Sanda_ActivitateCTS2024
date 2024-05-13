package Comportamental.State.clase;

public class Rezervat implements AbstractState{
    @Override
    public void schibaStareLoc(Loc loc) {
        loc.setAbstractState(this);
    }
    protected Rezervat(){

    }
}
