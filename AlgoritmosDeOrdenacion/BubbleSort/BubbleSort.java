import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        int n,aux;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de elementos que desea introducir: ");
        n=entrada.nextInt();
        int [] arrayNums = new int [n];
        System.out.println("Introduzca los elementos en cada posicion: ");
        for (int i=0;i<=n-1;i++){ //En java inicializo las variables aquí porque sino me da error el entrada.close()
            System.out.println("El elemento con posicion "+i+" es: ");
            arrayNums[i]=entrada.nextInt();
        }
        System.out.println("Ahora vamos a imprimir los numeros: ");
        for (int i=0;i<=n-1;i++){
            System.out.println("El elemento con posicion "+i+" es: "+arrayNums[i]);
        }
        //BubbleSort metodo 1:
        System.out.println("Ahora vamos a ordenar los elementos usando el metodo BubbleSort (metodo 1): ");
        for (int m=1;m<n-1;m++){ //En este metodo m se inicializa a 1 y se va restando en el segundo bucle
            for (int i=0;i<n-m;i++){ //En el primer for de este metodo daría igual poner m<=n o m<n-1
                if (arrayNums[i]>=arrayNums[i+1]){
                    aux=arrayNums[i];
                    arrayNums[i]=arrayNums[i+1];
                    arrayNums[i+1]=aux;
                }
            }
        }
        System.out.println("Imprimemos la lista ordenada: ");
        for (int i=0;i<=n-1;i++){
            System.out.println("El elemento con posicion "+i+" es: "+arrayNums[i]);
        }
        //BubbleSort metodo 2:
        System.out.println("Ahora vamos a ordenar los elementos usando el metodo BubbleSort (metodo 2): ");
        for (int m=0;m<n-1;m++){ //En este metodo m se inicializa a 0 y se va restando junto a m y a -1 en el segundo bucle
            for (int i=0;i<n-m-1;i++){
                if (arrayNums[i]>=arrayNums[i+1]){
                    aux=arrayNums[i];
                    arrayNums[i]=arrayNums[i+1];
                    arrayNums[i+1]=aux;
                }
            }
        }
        System.out.println("Imprimemos la lista ordenada: ");
        for (int i=0;i<=n-1;i++){
            System.out.println("El elemento con posicion "+i+" es: "+arrayNums[i]);
        }
        entrada.close();
        
    }
}
