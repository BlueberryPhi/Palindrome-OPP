/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Palabras {
    public String chain;
    public Palabras(String chain){
        this.chain=chain;
    }
    
    public String fetch(){
        return chain;
    }
    
    public void convertirPrimeraMayuscula ()
    {

        System.out.println("Frase con mayuscula: "+ chain.substring(0,1).toUpperCase()+ chain.substring(1));
  
    }
    
    public void invertirCadena ()
    {
       System.out.print("Frase invertida: ");
          int length=chain.length();
          for(int i=length-1;i>=0;i--){
              char charro= chain.charAt(i);
              System.out.print(charro);
          }
        System.out.println("");
    }
    
    public void convertirVocalesMayuscula ()
    {
        String chein;
        chein = chain.replace('a','A').replace('e','E').replace('i','I').replace('o','O').replace('u','U');
        System.out.println("Vocales mayusculas: "+chein);
    }
    
    
    public void checarPalindromo()
    {
        String choin;
        choin = this.chain;
        choin=choin.toLowerCase();
        choin = choin.replace(" ","");

        int sizetu = choin.length();
        String mew;
        String gyatt="";
        
        for(int i=sizetu-1;i>=0;i--)
        {
        mew = choin.substring(i,i+1);
        gyatt=gyatt.concat(mew);
        }
    
        //System.out.println(choin);
        //System.out.println(gyatt);
        if(choin.equals(gyatt))
        {
        System.out.println("Si es palindromo"); 
        }else{
        System.out.println("No es palindromo");
        }
        
    }
    
    
    
}
