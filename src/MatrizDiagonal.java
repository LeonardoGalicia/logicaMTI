import java.util.Scanner;

public class MatrizDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        int n = 0;
        String entrada = "";
        String respuesta = "SI";
        String[] entradaSeparada = null;
        n = sc.nextInt();
        int[] matrizAux = new int[n];
        int[][] matriz = new int[n][n];

        while (contador < n){
            sc = new Scanner(System.in);
            entrada = sc.nextLine();
            entradaSeparada = entrada.split(" ");
            for (int i = 0; i< entradaSeparada.length;i++){
                matriz[contador][i] = Integer.parseInt(entradaSeparada[i]);
            }
            contador++;
        }
        for (int i = 0;i < n; i++){
            matrizAux[i] = matriz[i][i];
        }
        int valor = matrizAux[0];
        for (int i = 1;i < n; i++){
            if(matrizAux[i] != valor){
                respuesta = "NO";
            }
        }
        System.out.println(respuesta);

    }
}
