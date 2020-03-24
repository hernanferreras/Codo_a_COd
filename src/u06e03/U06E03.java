
package u06e03;

import java.util.Scanner;

public class U06E03 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int largo;
        System.out.print("Ingrese la cantidad de posiciones del array: ");
        largo=entrada.nextInt();
        char[] valores = new char[largo];
        for(int i=0; i<valores.length; i++){
            System.out.print("Ingrese un caracter al array: ");
            valores[i]=entrada.next().charAt(0);
        }
        imprimeArray(valores);
    }
    static void imprimeArray (char[] a){
        char[] b = new char[a.length];
        int x,z=(a.length);
        for(x=0; x<a.length; x++){
            b[x] = a[z-1];
            z--;
            System.out.print(b[x]);
        }
    }
}