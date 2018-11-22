/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Gurpreet Singh
 */

public class Program1 {
    public static void main(String a[])
    {
        int size=2;
        ArrayList al =new ArrayList(size);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(6);
        Iterator ir=al.iterator();
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }
    }
}
