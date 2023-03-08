
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year;
        System.out.println("yil girin:");
        year=input.nextInt();
        
        if(year%4==0){
            System.out.println(year+"bir artik yildir.");
        }
       else if(year%100==0){
            if(year%400==0){
                System.out.println(year+"bir artik yildir.");
            }
            System.out.println(year+" bir artik yil degildir.");
        }
        else{
          System.out.println(year+" bir artik yil degildir.");
        }
    }
    
}
