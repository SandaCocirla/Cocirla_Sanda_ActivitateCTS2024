package Main;//de asemenea atunci cand joaca echipa locala se aplica un discount pentru toata lumea de 10%
//daca joaca echipanationala pe terenul respectiv se printeaza pe bilet un mesaj de sustinere aechipei nationale si nu a echipei locale

import BileteClase.Bilet;
import BileteClase.BiletAbstract;
import BileteDecoratoare.BiletLocal;
import BileteDecoratoare.BiletNational;
import BileteDecoratoare.DecoratorBilet;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet("A","B",10);
        imprimaBilete(bilet);

        DecoratorBilet bilet2 = new BiletLocal(bilet);
        bilet2.aplicaDiscount();
        imprimaBilete(bilet2);

        DecoratorBilet bilet3 = new BiletNational("Ro","Dk",30);
        bilet3.aplicaDiscount();
        imprimaBilete(bilet3);


    }
    public static void imprimaBilete(BiletAbstract biletAbstract){
        biletAbstract.printeazaBilet();
    }
}
