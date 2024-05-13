package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    public List<Elev> readElevi(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Elev> elevi = new ArrayList<Elev>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.citireAplicant(input2,elev);
            int clasa = input2.nextInt();
            elev.setClasa(clasa);
            String tutore = input2.next();
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }

    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        return null;
    }
}
