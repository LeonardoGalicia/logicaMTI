import java.util.Scanner;

public class BisiestoSencillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio=0;
        int error =0;
        String respuesta="";
        do{
            System.out.println("Ingresa el anio: ");
            anio = sc.nextInt();
            if(anio > 1600 && anio < 3000){
                error = 0;
            }else {
                error = 1;
            }

        }while (error == 1);

        if(anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0){
            respuesta = "S";
        }else if(anio % 4 == 0 && anio % 100 != 0){
            respuesta = "S";
        }else {
            respuesta = "N";
        }

        System.out.println(respuesta);

    }
}
