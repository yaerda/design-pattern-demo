package com.fhou77.designpattern.factoryMethod;

public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if ("finance".equals(type)) {
            return new ExportFinancePdfFile();
        } else {
            return new ExportStandardPdfFile();
        }
    }
}
