package Operators.Arithmetic_Operators;

import java.util.Random;

public class Rendom_Arithmetic {

    static void printInt(String s, int i){
        System.out.println(s + "=" + i);
    }
    static void printFloat(String s, float f){
        System.out.println(s + "=" + f);

    }

    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;

        j = rand.nextInt(100) + 1;
        k = rand.nextInt(100) + 1;
        printInt("j", j);
        printInt("k", k);

        i = j + k;
        printInt("j + k ", i);
        i = j -k;
        printInt("j-k",i);
        i = k / j;
        printInt("j/k",i);
        i = j *k;
        printInt("j*k",i);
        i = j %k;
        printInt("j%k",i);

        float u, v, w;
        v= rand.nextFloat()+1;
        w=rand.nextFloat()+1;
        printFloat("v", v);
        printFloat("W",w);


        u=v+w;
        printFloat("v+w", u);
        u=v-k;
        printFloat("v-k",u);
        u=v/k;
        printFloat("v/k", u);
        u=v*k;
        printFloat("v*k", u);
        u=v%k;
        printFloat("v%k", u);





    }
}
