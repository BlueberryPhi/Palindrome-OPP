/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Extra {
    public void crearFizzBuzz(){
        for(int i=1; i<=100; i++){
            if(i%3==0 && i% 5==0){
                System.out.println("Fizzbuzz");
            }
            else if(i % 3==0){
                System.out.println("Fizz");
            }
            else if(i % 5==0){
                System.out.println("Buzz");
            }
            else{
               System.out.println(i);
            }
    }
}
}
