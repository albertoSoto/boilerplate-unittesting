package com.studentsfp.devenvironment.unittesting.data;

public class Virus {
    private String name;
    private boolean isLetal = false;
    private Double rIndex = 0.;

    public Virus() {

    }

    public static void sayHi(){
        System.out.println("hi");
    }

    public Virus(String name, boolean isLetal) {
        this.name = name;
        this.isLetal = isLetal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLetal() {
        return isLetal;
    }

    public void setLetal(boolean letal) {
        isLetal = letal;
    }

    public Double getrIndex() {
        return rIndex;
    }

    public void setrIndex(Double rIndex) {
        this.rIndex = rIndex;
    }
}
