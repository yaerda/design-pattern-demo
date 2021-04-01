package com.fhou77.designpattern.abstractFactory;

public class AMDMotherboardFactory implements MotherboardFactory{
    @Override
    public void installCPU() {
        System.out.println("install AMD Cpu");
    }
}
