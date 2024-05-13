package Comportamental.State.clase;

public class Liber implements AbstractState{
    @Override
    public void schibaStareLoc(Loc loc) {
        loc.setAbstractState(this);
    }
    protected Liber(){

    }
}
