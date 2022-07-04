import java.util.*;

public class ColaDeLaSuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int contador = 0;
        String entrada = "";
        int prioridadAux = 0;
        List<String> respuesta = new ArrayList<>();
        String[] entradaSeparada = null;
        Map<String, Integer> clientes = new HashMap<>();
        n = sc.nextInt();
        while ( contador < n){
            sc = new Scanner(System.in);
            entrada = sc.nextLine();
            entradaSeparada = entrada.split(" ");
            if(!entradaSeparada[0].toUpperCase().equals("A")){
                if(entradaSeparada[0].toUpperCase().equals("C")){
                    clientes.put(entradaSeparada[1],Integer.parseInt( entradaSeparada[2]));
                }
                if (entradaSeparada[0].toUpperCase().equals("S") && !clientes.isEmpty()){
                    for(String clave : clientes.keySet()){
                        if(clave.contains(entradaSeparada[1])){
                            clientes.put(clave,clientes.get(clave) + Integer.parseInt(entradaSeparada[2]));
                        }
                    }
                }
            }else if(entradaSeparada[0].toUpperCase().equals("A") && !clientes.isEmpty()){
                String clave=clientes.keySet().toArray()[0].toString();
                Map<String, Integer> clientesDummy = new HashMap<>();
                clientesDummy.putAll(clientes);
                prioridadAux = clientes.get(clientes.keySet().toArray()[0]);

                for (Iterator<String> keys = clientesDummy.keySet().iterator(); keys.hasNext();){
                    if(prioridadAux >= clientes.get(keys.next())){
                        prioridadAux = clientes.get(keys.next());

                        if (keys.hasNext()){
                            clave = keys.next();
                        }

                    }
                }
                respuesta.add(clave);
                clientes.remove(clave);
            }

            contador++;
        }
        for (String res : respuesta){
            System.out.println(res);
        }



    }
}
