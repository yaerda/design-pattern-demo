package com.fhou77.designpattern.factoryMethod;

/**
 * 工厂模式：只需要提需求，不用管我工厂内部怎么实现
 * 简单工厂模式：相当于我只有一个工厂，提完需求后，我工厂内部决定用哪种工艺来匹配你的要求
 * 工厂方法模式：相当于我有多个工厂，先根据需求的类型来决定哪个工厂可以生产，然后工厂内部决定用哪种工艺来生产
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile exportFile = exportFactory.factory("finance");
        exportFile.export();

    }
}
