package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salary {
    private final double baseSalary;
    private static double IncreaseCoefficient=2.5;
    public final static double CEO=500000.0;

    public double getFullSalary(){
        return baseSalary*IncreaseCoefficient;
    }

    public static void setIncreaseCoefficient(double increaseCoefficient1){
        IncreaseCoefficient=increaseCoefficient1;
    }
}