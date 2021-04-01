package com.fhou77.designpattern.abstractFactory;

public class IntelCpu implements Cpu {
    @Override
    public void computePin() {
        System.out.println("Intel Cpu");
    }
}
