package com.company;
import java.util.Stack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String highAndLow = "-2 32 0 5";
        int h=0, l=0, z=0, fn=0, sn=0;
        List<Integer> list = new ArrayList<Integer>();
        char a;
        for (int c=0; c < highAndLow.length(); c++ ){
            if (highAndLow.charAt(c) == '-'){
                //a = highAndLow.charAt(c+1);
                //z = a;
                // = Integer.parseInt(args[0]);
                z= Character.digit(highAndLow.charAt(c+1),10);
                z=z-z*2;
                list.add(z);
                System.out.println("z= " + z);
                c++;
            }
            System.out.println(c);
            if (highAndLow.charAt(c) != ' ' && highAndLow.charAt(c) != '-'){
                fn= Character.digit(highAndLow.charAt(c),10);
                c++;
                /*if (highAndLow.charAt(c) != ' '){
                    sn= Character.digit(highAndLow.charAt(c),10);
                    fn=fn*10;
                    c++;

                }*/
                System.out.println(fn + " fn ");
                //fn=fn+sn;
                list.add(fn);
            }

        }
            //System.out.println("Max " + h + " Min " + l );
        System.out.println(list);
    }
}