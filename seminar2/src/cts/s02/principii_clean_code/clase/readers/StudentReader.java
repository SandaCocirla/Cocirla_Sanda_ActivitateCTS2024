package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{

    public List<Student> readStudents(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Student> studenti = new ArrayList<Student>();

        while (input.hasNext()) {
            Student student = new Student();
            super.citireAplicant(input,student);
            int an_studii = input.nextInt();
            student.setAn_studii(an_studii);
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }

    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        return null;
    }
}
