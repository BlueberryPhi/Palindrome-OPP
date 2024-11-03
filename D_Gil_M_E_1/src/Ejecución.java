
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Ejecución {
    public void iniciarPrograma(){
        Scanner scan= new Scanner(System.in);
        Palabras n1= new Palabras("hasta luego cocodrilo");
        Palabras n2= new Palabras("anita lava la tina");
        
        System.out.println("Frase: " + n1.fetch());

        n1.convertirPrimeraMayuscula();
        n1.invertirCadena();
        n1.convertirVocalesMayuscula();
        n1.checarPalindromo();
        System.out.println("==================================");
        
        System.out.println("Frase: " + n2.fetch());

        n2.convertirPrimeraMayuscula();
        n2.invertirCadena();
        n2.convertirVocalesMayuscula();
        n2.checarPalindromo();
         System.out.println("==================================");
         
        System.out.println("Gustas ejecutar el FizzBuzz? Es opcional");
        System.out.println("Escribe 's' para Sí, sí quiero");
        System.out.println("O cualquier otra cosa si no deseas ejecutarlo");
        String choice= scan.next();
        
        
        if(choice.equalsIgnoreCase("s")){
            Extra extra = new Extra();
           extra.crearFizzBuzz();
        }
    }
}
