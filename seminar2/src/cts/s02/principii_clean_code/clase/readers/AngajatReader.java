package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//
public class AngajatReader extends AplicantReader{

    public List<Angajat> readAngajati(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Angajat> angajati = new ArrayList<Angajat>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            super.citireAplicant(input2,angajat);
            int salariu = input2.nextInt();
            angajat.setSalariu(salariu);
            String ocupatie = input2.next();
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }

    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        return null;
    }
}
