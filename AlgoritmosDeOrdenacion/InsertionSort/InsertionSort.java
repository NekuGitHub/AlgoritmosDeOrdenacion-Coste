import java.util.Scanner;

public class InsertionSort{
    public static final Scanner entrada = new Scanner (System.in);

    public static void main(String [] args){
        int n,j,aux; //n va a ser el numero de elementos introducidos. j va a ser un indice. aux una var auxiliar.
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
        //InsertionSort:
        System.out.println("Ahora vamos a ordenar los elementos usando InsertionSort: ");
        for (int i=1;i<=n-1;i++) {
            j=i;
            for (j=i;j-1>=0;j--) {
                if (arrayNums[j]<arrayNums[j-1]) {
                    aux=arrayNums[j];
                    arrayNums[j]=arrayNums[j-1];
                    arrayNums[j-1]=aux;
                } else {
                    break;
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