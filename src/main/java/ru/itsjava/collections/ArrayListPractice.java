package ru.itsjava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Watch> watchesList=new ArrayList<>();
        Watch seiko=new Watch("Seiko","Vitaliy",18000);
        Watch gshock=new Watch("G-Shock","Best dancer",10000);

        watchesList.add(seiko);
        watchesList.add(gshock);

        for(Watch elemWatch: watchesList){
            System.out.println(elemWatch);
        }

        watchesList.remove(0); //удаляем 0 элемент- seiko

        for(Watch elemWatch: watchesList){
            System.out.println(elemWatch);
        }

        System.out.println("watchesList.contains(gshock) = " + watchesList.contains(gshock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));

        System.out.println(watchesList);

        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());

        watchesList.set(0,seiko);
        System.out.println(watchesList);

        watchesList.size();
    }
}
