
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
public class SecondLast {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int a;
        DataInputStream d= new DataInputStream(System.in);
        a=Integer.parseInt(d.readLine());
        if (a==a%10)
        {
            System.out.println(-1);
        }
        else
        {
            a=Math.abs(a)%100/10;
        System.out.println(a);
        }
    }
    
}
