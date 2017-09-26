/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eps;

/**
 *
 * @author Дмитрий
 */
import java.io.*;

public class Eps {
    public static void main(String args[])
            throws IOException
    {
        DataInputStream inData=new DataInputStream(System.in);
        String str1,str2;

            System.out.print("Введите значение x:");
            str1=inData.readLine();
            System.out.print("Введите значение eps:");
            str2=inData.readLine();

                double x=Double.parseDouble(str1);
                double eps=Double.parseDouble(str2);
                double fact,Zn,Sl,S=0;

                    int i,k=1;
                    i=1;fact=1;
                    Zn=fact+i;
                    Sl=x/(fact+i);

            while (Math.abs(Sl)>eps)
             {
                S=S+Sl;
                i++;
                fact*=i;
                k*=-1;
                Zn=fact+i;
                Sl=k*x/Zn;
            }
        System.out.print("S="+S);
    }
}
