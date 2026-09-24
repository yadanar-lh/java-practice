package com.ylh.oop_exe.abstraction_interface.exe3_document_export_system;

public class PdfExporter implements DocumentExporter{
    @Override
    public byte[] export(Object data) {
        String pdfContent = "[PDF BINARY DATA]: " + data.toString();
        return pdfContent.getBytes();
    }

    @Override
    public String getFileExtension() {
        return "pdf";
    }
}
