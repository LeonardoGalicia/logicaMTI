import java.util.Scanner;

public class LecturaYEscritura {
    public static final int SEGUNDOS = 60;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int error = 0;
        int minutos = 0;

        do{
            System.out.println("Ingresa los minutos a convertir: ");
            minutos = sc.nextInt();
            if (minutos >= 1 && minutos<=100){
                error = 0;
            }else {
                System.out.println("El numero de minutos debe estar dentro del rango 1 y 100");
                error = 1;
            }

        }while (error == 1);

        System.out.println("Segundos: "+  minutos * SEGUNDOS);

    }
}
