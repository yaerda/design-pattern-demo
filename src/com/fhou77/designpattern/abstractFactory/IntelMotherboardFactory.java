package com.fhou77.designpattern.abstractFactory;

public class IntelMotherboardFactory implements MotherboardFactory{
    @Override
    public void installCPU() {
        System.out.println("install Intel CPU");
    }
}
