/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        char[] s1 = sc.next().toCharArray();
        char[] s2 = sc.next().toCharArray();
        int[] so = new int[1000];
        for(int i = 0; i < s1.length; i++){
          so[s1[i]]++;
        }
        String result = "NO";
        for(int i = 0; i < s2.length; i++){
          if(so[s2[i]]>0){
            result = "YES";
            break;
          }
        }
        System.out.println(result);
      }
    }
    
}
