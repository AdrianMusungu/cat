package com.example.demo.models;

public class Appointment {

    private Long id;
    private Long studentId;
    private Long teacherId;
    private boolean confirmed;

    public Appointment(Long studentId ) {
        this.studentId = studentId;
        //this.teacherId = teacherId;
    }

    public Appointment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", studentId=" + studentId +
//                ", teacherId=" + teacherId +
//                ", confirmed=" + confirmed +
                '}';
    }
}
