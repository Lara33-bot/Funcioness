import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcioness.mostrarSaludo();
        System.out.println("Cual es tu nombre?");
        String nombre = input.nextLine();
        Funcioness.saludopersonalizado(nombre);
        System.out.println("Cual desea probar? 1. Area de tu rectangulo 2. Agregar mayusc 3. Par o impar 4. Entero al cuadrado");
        boolean confirmacion = true;
        while (confirmacion) {
            int decision = input.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Cual es la base de tu rectangulo");
                    Double base = input.nextDouble();
                    System.out.println("Ahora la altura de tu rectangulo");
                    Double altura = input.nextDouble();
                    Funcioness.calcularRectang(base, altura);
                    confirmacion = false;
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Entre un texto");
                    String texto = input.nextLine();
                    Funcioness.textoAMayus(texto);
                    confirmacion = false;
                    break;
                case 3:
                    System.out.println("Entre un numero");
                    int numero = input.nextInt();

                    if (Funcioness.esPar(numero)) {
                        System.out.println(Funcioness.esPar(numero) + "Es par");
                    }
                    else {
                        System.out.println(Funcioness.esPar(numero) + "Es impar");
                    }
                    confirmacion = false;
                    break;
                case 4:
                    System.out.println("Ingrese un entero");
                    long entero = input.nextLong();
                    long cuadrado = Funcioness.hacerCuadrado(entero);
                    System.out.println(cuadrado);
                    confirmacion = false;
                    break;
                case 5:
                    System.out.println("Ingrese un entero");
                    int num =input.nextInt();
                    int sum = Funcioness.hacerFactorial(num);
                    System.out.println(sum);

                    confirmacion = false;
                    break;

                case 6:
                    System.out.print("¿Cuántos números querés sumar? ");
                    int cantidad = input.nextInt();

                    int[] numeros = new int[cantidad];

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        numeros[i] = input.nextInt();
                    }

                    int resultado = Funcioness.sumarNumeros(numeros);
                    System.out.println("La suma es: " + resultado);

                    confirmacion = false;
                    break;

                case 7:
                    System.out.println("Ingresa los numero y usa x para cerrar");


                    confirmacion = false;
                    break;

                case 10:

                    confirmacion = false;
                    break;
                default:
                    System.out.println("Vuelva a intentar");
            }
        }
    }
}