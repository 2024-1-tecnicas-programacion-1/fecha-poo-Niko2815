package fecha;

import java.util.Scanner;

public class Principal {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el dia, el mes y el año");
          Fecha fecha = new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt());
          fecha.fechaCorta();
          fecha.mesLetra();
          System.out.println(fecha.fechaLarga());
          
     }
}
