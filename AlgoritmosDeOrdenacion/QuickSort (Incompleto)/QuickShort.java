import java.util.Scanner; 

public class QuickShort {

    static Scanner entrada = new Scanner(System.in);

    public static void main (String [] args) {       
        int pivote,aux; 
        System.out.println("Introduzca el numero de elementos que desa introducir: ");
        int n = entrada.nextInt();
        int [] arrayNums = new int[n];
        System.out.println("Pasemos a introducir los valores en cada posicion: ");
        for(int i=0;i<=n-1;i++){
            System.out.println("El valor con posicion " + i + " va a tener valor: ");
            arrayNums[i]=entrada.nextInt();
        }
        System.out.println("Ahora vamos a imprimir los numeros: ");
        for(int i=0;i<=n-1;i++){
            System.out.println("El valor con posicion " + i + " tiene valor: " + arrayNums[i]);
        }
        //QuickSort:
        System.out.println("Pasemos a ordenar el array usando el metodo QuickSort: ");
        pivote=arrayNums[arrayNums.length-1];
        for(int i=0;i<=n-1;i++) {
            
        }
        for(int i=0;i<=n-1;i++){
            System.out.println("Despues del QuickSort: ");
            System.out.println("El valor con posicion " + i + " tiene valor: " + arrayNums[i]);
        }
    }
}

