package com.company;

/**
 * Created by david on 4/23/14.
 */
public class ChemicalElement {
    private String name, symbolic_name;
    private int atomic_number;

    public ChemicalElement(String name, String symbolic_name, int atomic_number) {
        this.name = name;
        this.symbolic_name = symbolic_name;
        this.atomic_number = atomic_number;
    }

    public String getName() {
        return name;
    }

    public String getSymbolic_name() {
        return symbolic_name;
    }

    public int getAtomic_number() {
        return atomic_number;
    }
}
