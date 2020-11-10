package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Boy implements Comparable<Boy> {
    private final String name;
    private double age;
    private double high;

    @Override
    public int compareTo(Boy boy) {
        return (int)(high-boy.high);
    }
}
