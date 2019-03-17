package com.company;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String highAndLow = "2 -9 7 3 4 1 5";
        int h=0, z=0;
        int l=Character.digit(highAndLow.charAt(0), 10);;
        //char z='-';

        for (int c=0; c < highAndLow.length(); c++ ){
            if (highAndLow.charAt(c) != 32 ) {
                System.out.println(highAndLow.charAt(c));
                if(h < Character.digit(highAndLow.charAt(c), 10)){
                    h=Character.digit(highAndLow.charAt(c), 10);
                    //if (highAndLow.charAt(c-1) == '-' ){
                    //    h=Math.abs(h);
                    //}
                }
                if (l > Character.digit(highAndLow.charAt(c), 10)){
                    l=Character.digit(highAndLow.charAt(c), 10);


                }
                z=c;
                int n = Character.digit(highAndLow.charAt(c),10);
                if (highAndLow.charAt(z--) == 45 ){
                   // System.out.println(l);
                    System.out.println("!- " + (l=n-(n*2)));
                }

            }
        }


            System.out.println("Max " + h + " Min " + l );

    }
}
