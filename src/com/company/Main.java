package com.company;
import java.util.Stack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String highAndLow = "-1 -1";
        int h=0, l=0, z=0, fn=0, sn=0, c;
        List<Integer> list = new ArrayList<Integer>();
        char a;
        for (c=0; c < highAndLow.length(); c++ ){
            if (highAndLow.charAt(c) != ' ' && highAndLow.charAt(c) != '-'){
                fn= Character.digit(highAndLow.charAt(c),10);
                // = Integer.parseInt(args[0]);
                z=c;
                c++;
                if (c<highAndLow.length()) {
                    if (highAndLow.charAt(c) != ' ') {
                        sn = Character.digit(highAndLow.charAt(c), 10);
                        fn = fn * 10 + sn;
                        }
                 }
                if (z>1){
                if (highAndLow.charAt(z-1) == '-'){
                    fn=fn-fn*2;
                }}
                list.add(fn);
            }
        }
        for (int t=0; t < list.size(); t++ ){
            h=Math.max(h, list.get(t));
            l=Math.min(l, list.get(t));
        }
            System.out.println( String.format("%d %d", h, l) );
        System.out.println(list);
        //return String.format("%02d %02d", h, l);
    }
}