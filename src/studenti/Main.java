package studenti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Pero",3));
        studenti.add(new Student("Maja",5));
        studenti.add(new Student("Josip",2));
        Collections.sort(studenti);
        for (Student s : studenti) {
            System.out.println(s);

        }

        studenti.sort(Comparator.reverseOrder());
        for (Student s : studenti) {
            System.out.println(s);

        }
    }

}
