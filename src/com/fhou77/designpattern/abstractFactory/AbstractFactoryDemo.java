package com.fhou77.designpattern.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerEnginer computerEnginer = new ComputerEnginer();
        computerEnginer.createComputer(new IntelFactory());
    }
}
