import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcioness.mostrarSaludo();
        System.out.println("Cual es tu nombre?");
        String nombre = input.nextLine();
        Funcioness.saludopersonalizado(nombre);
        System.out.println("Cual desea probar? 1. Area de tu rectangulo 2. Agregar mayusc 3. Par o impar");
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
                        System.out.println("Es par");
                    }
                    else {
                        System.out.println("Es impar");
                    }

                    break;
                default:
                    System.out.println("Vuelva a intentar");
            }
        }
    }
}