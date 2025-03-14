package studenti;

public class Student implements Comparable<Student> {
    String ime;
    int ocjena;

    public Student(String ime, int ocjena) {
        this.ime = ime;
        this.ocjena = ocjena;
    }

    @Override
    public String toString() {
        return "Student \nIme: "+ime+"\nOcijena: "+ocjena;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(ocjena, o.ocjena);
    }
}

