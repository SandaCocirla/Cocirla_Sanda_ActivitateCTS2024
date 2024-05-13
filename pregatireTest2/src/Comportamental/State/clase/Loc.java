package Comportamental.State.clase;

public class Loc {
    private int numar;
    private String zona;

    private AbstractState abstractState;

    public Loc(int numar, String zona) {
        this.numar = numar;
        this.zona = zona;
        this.abstractState = new Liber();
    }

    public void setAbstractState(AbstractState abstractState) {
        this.abstractState = abstractState;
    }

    public void rezerveazaLoc(){
        if (abstractState instanceof Liber){
            System.out.println("Locul cu numarul "+ this.numar +" poate fi rezervat");
            AbstractState rezervat = new Rezervat();
            rezervat.schibaStareLoc(this);
        } else {
            System.out.println("Locul cu numarul "+ this.numar +" nu e disponibil pentru rezervare");
        }
    }

    public void ocupaLoc(){
        if(abstractState instanceof Liber || abstractState instanceof Rezervat){
            System.out.println("Locul cu numarul " + this.numar +" poate fi ocupat");
            AbstractState ocpuat = new Ocupat();
            ocpuat.schibaStareLoc(this);
        }
        else{
            System.out.println("Locul cu numarul "+ this.numar +" nu e disponibil pentru a fi ocupat");
        }
    }

    public void elibereazaLoc(){
        if(abstractState instanceof Ocupat){
            System.out.println("Locul cu numarul" + this.numar + " poate fi eliberat");
            AbstractState eliberat = new Liber();
            eliberat.schibaStareLoc(this);

        }else{
            System.out.println("Nu se poate elibera un loc neocupat");
        }
    }
}
