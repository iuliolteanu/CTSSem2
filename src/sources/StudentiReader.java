package sources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements ApplicantsReader{
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> studenti = citireAplicantiDinScanner(scanner);

        scanner.close();
        return studenti;
    }

    private List<Aplicant> citireAplicantiDinScanner (Scanner scanner) {
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student=new Student();
            ApplicantReader.citireAplicant(scanner, student);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next());
            student.setAnStudii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        return studenti;
    }
}
