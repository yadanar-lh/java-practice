package com.ylh.oop_exe.abstraction_interface.exe3_document_export_system;

public class DocumentFactory {

    static void main() {
        PdfExporter pdf = new PdfExporter();
        JsonExporter json = new JsonExporter();

        byte[] pdfByte = pdf.export("Sample Pdf");
        System.out.println(new String(pdfByte));

        System.out.println(pdf.getFileExtension());
        System.out.println(pdf.getMimeType());
        System.out.println();

        byte[] jsonByte =json.export("Sample Data");
        System.out.println(new String(jsonByte));

        System.out.println(json.getFileExtension());
        System.out.println(json.getMimeType());
    }
}
