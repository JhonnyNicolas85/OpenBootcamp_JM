public class App2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.numpuertas);
    }
}

class Coche {
    public int numpuertas = 0;

    public void AgregarPuertas() {
        this.numpuertas++;
    }

    public void QuitarPuertas() {
        this.numpuertas--;
    }
}
