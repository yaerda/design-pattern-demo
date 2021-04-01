package com.fhou77.designpattern.factoryMethod;

public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public void export() {
        System.out.println("导出标准的Html文件");
    }
}