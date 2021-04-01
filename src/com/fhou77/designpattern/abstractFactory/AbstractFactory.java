package com.fhou77.designpattern.abstractFactory;

public interface AbstractFactory {
    public Cpu createCPU();
    public MotherboardFactory createMotherboard();
}
