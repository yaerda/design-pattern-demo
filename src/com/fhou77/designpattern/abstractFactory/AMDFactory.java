package com.fhou77.designpattern.abstractFactory;

public class AMDFactory implements AbstractFactory {
    @Override
    public Cpu createCPU() {
        return new AMDCpu();
    }

    @Override
    public MotherboardFactory createMotherboard() {
        return new AMDMotherboardFactory();
    }
}
