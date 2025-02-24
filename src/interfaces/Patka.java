package interfaces;

public class Patka implements Leti,Pliva{
    @Override
    public void leti() {
        System.out.println("Leti");
    }

    @Override
    public void pliva() {
        System.out.println("Pliva");
    }
}
