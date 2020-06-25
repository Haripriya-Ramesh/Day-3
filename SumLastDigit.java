
import java.io.DataInputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @HaripriyaHp
 */
public class SumLastDigit {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        DataInputStream d= new DataInputStream(System.in);
        a=Integer.parseInt(d.readLine());
        b=Integer.parseInt(d.readLine());
        a=Math.abs(a)%10;
        b=Math.abs(b)%10;
        int add=a+b;
        System.out.println(add);
        
    }
    
}
