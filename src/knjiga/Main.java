package knjiga;

import interfaces.Leti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Knjiga> knjige = new ArrayList<>();
        Knjiga k1=new Knjiga("Arheologija");
        Knjiga k2=new Knjiga("Zoologija");
                Knjiga k3=new Knjiga("Programiranje");
        knjige.add(k1);
        knjige.add(k2);
        knjige.add(k3);

        k2.posudiknjigu();
        k1.vratiknjigu();


        for (Knjiga k : knjige) {
            System.out.println(k);
        }
        System.out.println("*******************");
        Collections.sort(knjige);
        for (Knjiga k : knjige) {
            System.out.println(k);
        }
    }

}
