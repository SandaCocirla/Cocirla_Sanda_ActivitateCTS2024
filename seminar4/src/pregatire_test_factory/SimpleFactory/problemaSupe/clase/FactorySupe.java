package pregatire_test_factory.SimpleFactory.problemaSupe.clase;

public class FactorySupe {
    public Supa creeazaSupa(TipSupa tipSupa)throws Exception{
        switch(tipSupa){
            case supaDeLegume:
                return new SupaDeLegume();
            case supaDeCiuperci:
                return new SupaDeCiuperci();
            case supaDeVita:
                return new SupaDeVita();
            default:
                throw new Exception("Nu exista tipul supei");
        }
    }
}
