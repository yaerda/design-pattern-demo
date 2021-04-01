package com.fhou77.designpattern.abstractFactory;

public class AMDCpu implements Cpu {
    @Override
    public void computePin() {
        System.out.println("AMD Cpu");
    }
}
