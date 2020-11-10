package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
//        String name="Vitaliy";
//        String copyName="Vitaliy";
//
//        System.out.println("name==copyName = " + name == copyName);
//
//        String constructorName=new String("Valeriy");
//        System.out.println("name==constructorName = " + name == constructorName);
//
//        String internName=constructorName.intern();
//        System.out.println("internName==name = " + internName == name);

        String str="Я строка";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.equals(\"я строкА\") = " + str.equalsIgnoreCase("я строкА"));

        String[] strings=str.split(" ");
        System.out.println("strings[0] = " + strings[0]);
        System.out.println("strings[1] = " + strings[1]);

//        for(int i=0;i<10000000;i++){
//            str=str+"!";
//        }

        StringBuilder stringBuilder=new StringBuilder(str);
        for(int i=0;i<10000000;i++){
            stringBuilder.append('!');
        }

    }
}
