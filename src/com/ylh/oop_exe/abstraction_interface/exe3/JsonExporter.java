package com.ylh.oop_exe.abstraction_interface.exe3;

public class JsonExporter implements DocumentExporter{
    @Override
    public byte[] export(Object data) {
        String jsonContent = "{\"data\": \"" + data.toString() + "\"}";
        return jsonContent.getBytes();
    }

    @Override
    public String getFileExtension() {
        return "json";
    }

    @Override
    public String getMimeType() {
        return "application/json";
    }
}
