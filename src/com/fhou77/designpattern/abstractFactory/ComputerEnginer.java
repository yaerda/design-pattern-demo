package com.fhou77.designpattern.abstractFactory;

public class ComputerEnginer {
    private Cpu cpu;
    public MotherboardFactory motherboardFactory;

    public void createComputer(AbstractFactory af) {
        Cpu cpu = af.createCPU();
        MotherboardFactory motherboard = af.createMotherboard();
        cpu.computePin();
        motherboard.installCPU();
    }
}
