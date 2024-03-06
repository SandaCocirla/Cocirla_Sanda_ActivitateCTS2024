package guverneleLumii.main;

import guverneleLumii.clasa.Guvern;
import guverneleLumii.clasa.RegistryGuvern;

public class Program {
    public static void main(String[] args) {
        RegistryGuvern registryGuvern = RegistryGuvern.getInstance();
        registryGuvern.adaugaGuvern("Romania","Marian",20);
        registryGuvern.adaugaGuvern("Romania","Ion",10);

        registryGuvern.getGuvern("Romania").setNumePrimMinistru("Daniel");
        registryGuvern.adaugaGuvern("Ungaria","Victor",30);

        System.out.println(registryGuvern.getGuvern("Romania"));
        System.out.println(registryGuvern.getGuvern("Ungaria"));
    }
}
