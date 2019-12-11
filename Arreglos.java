package examenjava;

import java.util.Scanner;

/**
 *
 * @author ela24
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        int arreglo[][] = new int [3][3];
        int arreglo2[][] = new int [3] [3];
        int arregloR[] = new int [3];
        
        
        //Se llena la matriz 1
        System.out.println("Digite la matriz");
        for(int i=0;i<arreglo.length;i++){
            for(int j=0; j<arreglo.length;j++){
                System.out.print("Matriz("+i+")("+j+"): ");
                arreglo[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa mariz es: "
                + "");
        for(int i=0;i<arreglo.length;i++){
          for( int j=0;j<arreglo.length;j++){
              System.out.print(arreglo[i][j]+" ");
          } 
          System.out.println(" ");
        }
        //Se llena la matriz 2
        System.out.println("Digite la matriz");
        for(int i=0;i<arreglo2.length;i++){
            for(int j=0; j<arreglo2.length;j++){
                System.out.print("Matriz("+i+")("+j+"): ");
                arreglo2[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa mariz es: ");
        for(int i=0;i<arreglo2.length;i++){
          for( int j=0;j<arreglo2.length;j++){
              System.out.print(arreglo2[i][j]+" ");
          } 
          System.out.println(" ");
        }
       
         System.out.println("IMPRESION SIN ARREGLO DE LA MITAD: ");
        System.out.println("PRIMER ARREGLO: ");
        System.out.println(arreglo[0][1]);
        System.out.println(arreglo[1][1]);
        System.out.println(arreglo[2][1]);
        System.out.println("SEGUNDO ARREGLO: ");
        System.out.println(arreglo2[0][1]);
        System.out.println(arreglo2[1][1]);
        System.out.println(arreglo2[2][1]);

    }
}
