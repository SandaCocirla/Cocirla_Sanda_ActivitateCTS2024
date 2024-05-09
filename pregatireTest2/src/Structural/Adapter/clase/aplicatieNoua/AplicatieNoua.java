package Structural.Adapter.clase.aplicatieNoua;

public class AplicatieNoua implements AplicatieNouaInterface{
    @Override
    public boolean verificăStocPentruMedicament(int idMedicament, int nrDorit) {
        if(nrDorit>0){
            System.out.println("Medicamentele dorite sunt disponibile in aplicatia noua");
            return true;
        }else{
            System.out.println("Medicamentele dorite nu sunt disponibile in aplicatia noua");
            return false;
        }
    }
}
