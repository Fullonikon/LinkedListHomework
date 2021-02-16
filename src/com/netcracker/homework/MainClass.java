package com.netcracker.homework;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 10000001; i++){
            myLinkedList.add(10);
        }
        double a1 = System.nanoTime()/1000000000d;
        myLinkedList.get(10000000);
        double a2 = System.nanoTime()/1000000000d;
        System.out.printf("поиск\n%.5E%n",a2-a1);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000001; i++){
            linkedList.add(10);
        }
        a1 = System.nanoTime()/1000000000d;
        myLinkedList.get(10000000);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("%.5E%n",a2-a1);


        a1 = System.nanoTime()/1000000000d;
        myLinkedList.add(10000000, 10);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("добавление\n%.5E%n",a2-a1);

        a1 = System.nanoTime()/1000000000d;
        linkedList.add(10000000, 10);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("%.5E%n",a2-a1);


        a1 = System.nanoTime()/1000000000d;
        myLinkedList.remove(10000000);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("удаление\n%.5E%n",a2-a1);

        a1 = System.nanoTime()/1000000000d;
        linkedList.remove(10000000);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("%.5E%n",a2-a1);


        a1 = System.nanoTime()/1000000000d;
        myLinkedList.set(10000000, 11);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("замена\n%.5E%n",a2-a1);

        a1 = System.nanoTime()/1000000000d;
        linkedList.set(10000000, 11);
        a2 = System.nanoTime()/1000000000d;
        System.out.printf("%.5E%n",a2-a1);
    }
}
