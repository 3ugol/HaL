package com.company;
import java.util.Stack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String highAndLow = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6 "; // "-1 -1 0 " "1 1 " "1 -1 0 " "1 -1 " "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6 "
        int h=0, l=0, z=0, fn=0, sn=0, c;             // "10 2 -2 -10 " "1 1 0 " "-942 -260 347 624 -234 -429 -824 "
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
                        c++;
                        if (c<highAndLow.length()) {
                            if (highAndLow.charAt(c) != ' ') {
                                sn = Character.digit(highAndLow.charAt(c), 10);
                                fn = fn * 10 + sn;

                            }
                        }
                        }
                 }
                if (z>=1){
                if (highAndLow.charAt(z-1) == '-'){
                    fn=fn-fn*2;
                }}
                list.add(fn);
            }
        }
        h=list.get(0);
        l=list.get(0);

        for (int t=0; t < list.size(); t++ ){
            h=Math.max(h, list.get(t)); //variant 1
            if (l > list.get(t)) l=list.get(t); //variant 2
        }
            System.out.println( String.format("%d %d", h, l) );
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        //return String.format("%02d %02d", h, l);
    }
}