package com.ylh.oop_exe.abstraction_interface.exe3;

public interface DocumentExporter {
    byte[] export(Object data);
    String getFileExtension();

    static boolean isValidData(Object data){
        return data != null;
    }

    default String getMimeType(){
        return "application/octet-stream";
    }
}
