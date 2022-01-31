import java.util.Scanner;

public class SelectionSort{
    public static void main(String [] args){
        int n,numMenor,aux;
        Scanner entrada = new Scanner (System.in);
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
        //SelectionSort:
        System.out.println("Ahora vamos a ordenar los elementos usando SelectionSort: ");
        for (int m=0;m<=n-1;m++){
            numMenor=m;
            for (int i=m+1;i<=n-1;i++){
                if (arrayNums[i]<arrayNums[numMenor]) {
                    aux=arrayNums[i];
                    arrayNums[i]=arrayNums[numMenor];
                    arrayNums[numMenor]=aux;
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