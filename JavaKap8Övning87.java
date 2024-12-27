/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javakap8övning8.pkg7;
import java.util.Scanner;

/**
 *
 * @author dogge
 */
public class JavaKap8Övning87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println( "Miniräknare\n\n" );
        System.out.print("Tryck j för att starta: ");
        
        char fortsätt;
       
         int tal1, tal2;
         char räknesätt;
         
         do
         {
             System.out.print("Tal 1: "); tal1 = input.nextInt();
             System.out.print("Tal 2: "); tal2 = input.nextInt();
             System.out.print("Ange räknesätt: "); räknesätt = input.next().charAt(0);
             if (räknesätt == '+')
             {
             System.out.println(tal1 +" + " +tal2 +" = " +(tal1+tal2));
             }
             else if (räknesätt == '-')
             {
                 System.out.println(tal1 + " - " +tal2 +" = " + (tal1-tal2));
             }
             
             System.out.print("Fortsätt? (j/n: ");
             fortsätt = input.next().charAt(0);
         }
         while ( fortsätt!= 'n');
         }
    }

         
         
    
    

