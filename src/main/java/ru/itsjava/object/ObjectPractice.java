package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));

        obj2=obj1;
        System.out.println(obj1.equals(obj2));

        Dog dog1=new Dog("Журка",4);
        Dog dog2=new Dog("Журка",4);
        Dog dog3=new Dog("Мурка",4);

        System.out.println("Две журки "+dog1.equals(dog2));
        System.out.println("Журка и Мурка "+dog1.equals(dog3));

        System.out.println(dog1.equals(obj1));

        System.out.println(dog1.toString());

        System.out.println(dog1.getNickname());
    }
}
