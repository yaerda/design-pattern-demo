package com.fhou77.designpattern.factoryMethod;

public class ExportFinanceHtmlFile implements ExportFile {
    @Override
    public void export() {
        System.out.println("导出finance的Html文件");
    }
}