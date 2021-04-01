package com.fhou77.designpattern.factoryMethod;

public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if ("finance".equals(type)) {
            return new ExportFinanceHtmlFile();
        } else {
            return new ExportStandardHtmlFile();
        }
    }
}
