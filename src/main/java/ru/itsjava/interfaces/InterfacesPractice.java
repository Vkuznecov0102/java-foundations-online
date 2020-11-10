package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
        Creatable hottabich=new Gin();
        hottabich.createWish();

        Creatable badGin=new BadGin();
        badGin.createWish();

        hottabich.canYouCreateWish();
        badGin.canYouCreateWish();
    }
}
