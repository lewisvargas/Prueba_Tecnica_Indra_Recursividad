/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Lewis Vargas Flórez
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String str = "ABC";
        System.out.println("Lista de Permutacion de Recursividad:");
        permutacionRecursiva(str.toCharArray(), 0);
        // TODO code application logic here           
    }
    
    public static void permutacionRecursiva(char[] str, int i) {
        if(i >= str.length){
            return;
        }if(i == str.length-1){
            System.out.println(String.valueOf(str));
        }else{
            for(int j = i; j < str.length; j++){
                char temp = str[j];
                str[j] = str[i];
                str[i] = temp;
                
                permutacionRecursiva(str, i+1);
                
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
    }
    
}
