/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Punto3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, k, a, b, resul;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int sum = 0;
        resul = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();        
        for (int i=0; i<n; i++){ 
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum += a; 
            
            if (b == 1){ 
                list.add(a);
                resul++;
            } 
        }
        
        Collections.sort(list);
        
        while(resul > k){
            sum = sum - (2 * list.get(0));
            list.remove(0);
            resul--;
        }
        System.out.println(sum);
    }
}

