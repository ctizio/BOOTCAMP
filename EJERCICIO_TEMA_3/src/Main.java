public class Main {

    public static void main(String[] args) {
        suma(30, 50, 87);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas de mi auto es: " + miCoche.numeroDePuertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la suma de los 3 numeros es: "+resultado);
    }
}

class Coche {
    public int numeroDePuertas = 0;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}