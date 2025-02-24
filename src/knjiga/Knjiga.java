package knjiga;

//TODO Implementirate ovo sučelje u klasi Knjiga.
// Klasa Knjiga također treba implementirati ugrađeno Java sučelje Comparable<Knjiga>, kako bi se knjige mogle sortirati po naslovu.
// U main metodi kreirajte popis knjiga, posudite/vratite knjigu i sortiraite ih.
// Zahtjevi:
// * Definirajte sučelje PosudbaKnjige s metodama:
// void posudiknjigu();
// void vratiknjigu();
// * Implementirajte ovo sučelje u klasi Knjiga s:
// Atributima: naslov knjige i status dostupnosti (jePosudjena).
// Metodom compareTo() za sortiranje knjiga abecedno po naslovu.
// U main metodi: Kreirajte popis knjiga.Posudite i vratite knjigu.
// Sortirajte knjige abecedno i prikažite ih. Knjiga A vraćena Knjiga B posuđena


public class Knjiga implements PosudbaKnjiga, Comparable<Knjiga> {
    String naziv;
    boolean posuđena = false;


    public Knjiga(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public int compareTo(Knjiga o) {
        return naziv.compareTo(o.naziv);
    }

    @Override
    public void posudiknjigu() {
        this.posuđena = true;
    }

    @Override
    public void vratiknjigu() {
        this.posuđena = false;

    }

    @Override
    public String toString() {

        if (posuđena) {
            return "Knjga :" + naziv + " je Posuđena";
        } else {

        }
        return "Knjga :" + naziv + " nije Posuđena" ;
    }
}
