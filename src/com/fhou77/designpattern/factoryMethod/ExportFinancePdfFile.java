package com.fhou77.designpattern.factoryMethod;

public class ExportFinancePdfFile implements ExportFile {
    @Override
    public void export() {
        System.out.println("导出finance的PDF文件");
    }
}
