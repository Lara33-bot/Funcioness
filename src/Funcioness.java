
public class Funcioness {
    public static void mostrarSaludo() {
        System.out.println("Hola Mundo!");
    }

    public static void saludopersonalizado(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void calcularRectang(Double base, Double altura) {
        double Rectangulo = base * altura;
        System.out.println("Tu area es " + Rectangulo);
    }

    public static void textoAMayus(String texto) {
        String mayus = texto.toUpperCase();
        System.out.println(mayus);

    }

    public static boolean esPar(double numero) {
        return numero % 2 == 0;
    }

    public static long hacerCuadrado(long entero) {
        return entero * entero;
    }

    public static int hacerFactorial(int num) {
        int sum = 1;
        int cont = num;
         while (num > 0) {
            sum = sum * num;
            num = num - 1;
        }

        return sum;
    }
     public static int sumarNumeros(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
}
