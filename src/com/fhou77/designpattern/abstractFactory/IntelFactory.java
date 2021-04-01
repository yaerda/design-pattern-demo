package com.fhou77.designpattern.abstractFactory;

public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCPU() {
        return new IntelCpu();
    }

    @Override
    public MotherboardFactory createMotherboard() {
        return new IntelMotherboardFactory();
    }
}
