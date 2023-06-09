package com.example.handlingformsubmission;

public class FormData {
    private String qCode;
    private String qType;
    private String qText;
    private String aCode;

    // Getters
    public String getQCode() {
        return qCode;
    }

    public String getQType() {
        return qType;
    }

    public String getQText() {
        return qText;
    }

    public String getACode() {
        return aCode;
    }

    // Setters
    public void setQCode(String qCode) {
        this.qCode = qCode;
    }

    public void setQType(String qType) {
        this.qType = qType;
    }

    public void setQText(String qText) {
        this.qText = qText;
    }

    public void setACode(String aCode) {
        this.aCode = aCode;
    }

    // Optional: You can also override the toString() method for better representation
    @Override
    public String toString() {
        return "FormData{" +
                "qCode='" + qCode + '\'' +
                ", qType='" + qType + '\'' +
                ", qText='" + qText + '\'' +
                ", aCode='" + aCode + '\'' +
                '}';
    }
}
