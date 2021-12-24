package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имён: ");

        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name = scanner.next();
            a.add(name);
        }
        System.out.println("Список А: " + a);

        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name = scanner.next();
            b.add(name);
        }
        System.out.println("Список Б: " + b);

        ArrayList<String> c = new ArrayList<>();
        c.add(a.get(0));
        c.add(b.get(4));
        c.add(a.get(1));
        c.add(b.get(3));
        c.add(a.get(2));
        c.add(b.get(2));
        c.add(a.get(3));
        c.add(b.get(1));
        c.add(a.get(4));
        c.add(b.get(0));

        System.out.println("Список С: " + c);

        Comparator d = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length()) ;
            }
        };
        Collections.sort(c, d);
        System.out.println(c);
    }
}
