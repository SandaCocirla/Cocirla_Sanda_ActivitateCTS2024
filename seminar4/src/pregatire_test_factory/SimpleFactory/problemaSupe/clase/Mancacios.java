package pregatire_test_factory.SimpleFactory.problemaSupe.clase;

public class Mancacios {

     public void mananca(TipSupa tipSupa){
          FactorySupe factorySupe = new FactorySupe();
          try{
               Supa supaCeruta1 =factorySupe.creeazaSupa(tipSupa);
               supaCeruta1.descriereIngrediente();
          }catch(Exception e){
               e.printStackTrace();
          }
     }
}
