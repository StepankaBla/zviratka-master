package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Animal("Pepik", 45,Typ.PIG);
        Animal an2 = new Animal("Liza", 34,Typ.CAT);
        Animal an3 = new Animal("Dogo", 2,Typ.DOG);


        System.out.println(an1 + "\n" + an2 + "\n" + an3 );

    }
}
