package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {

		List<Angajat> listaAngajati;
		AplicantReader angajatReader = new AngajatReader();

		try {
			listaAngajati = angajatReader.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
