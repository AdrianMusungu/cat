package com.example.demo.models;

public class Attachment {

    private Long id;
    private Long studentId;

    public Attachment(Long studentId) {
        this.studentId = studentId;
        //this.teacherId = teacherId;
    }
    public Attachment() {
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "Attachment{" +

                " studentId=" + studentId +

                '}';
    }
}
