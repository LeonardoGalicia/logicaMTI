import java.util.*;

public class ContarLapices {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String numero="";
        String numeroLapizContar ="";
        int contador=0;
        List<String> numeros = new ArrayList<>();
        while (!numero.equals("x")){
            System.out.println("Ingresa el numero del lapiz:");
            numero = sc.nextLine();
            numeros.add(numero);
            System.out.println("nota: si a terminado de ingresar la lista, ingrese x");
        }
        System.out.println("\nIngresa el numero de lapiz a contar (KK)");
        numeroLapizContar = sc.nextLine();
        for(String num: numeros){
            if(num.equals(numeroLapizContar)){
                contador++;
            }
        }


        System.out.println("Hay "+contador+" lapices del numero "+ numeroLapizContar);
    }
}
