public class App {
    public static void main(String[] args) throws Exception {

        sum(10, 20, 30);

        Coche miCoche = new Coche(4);
        miCoche.AddPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void sum(int a, int b, int c) {
        int result;
        result = a + b + c;

        System.out.println(result);
    }

}

class Coche {
    public int puertas;

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public void AddPuerta() {
        this.puertas++;
    }
}