package com.example.demo;

import com.example.demo.models.Appointment;
import com.example.demo.models.Attachment;
import com.example.demo.models.Lecturer;
import com.example.demo.models.Student;
//import com.sun.xml.internal.ws.api.message.Attachment;
import feign.Body;
import org.hibernate.annotations.common.reflection.XMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "adrianClient", url = "http://10.51.10.111:2000", configuration = FeignConfig.class)
public interface FeignClient {

    //Register Student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);


    //Get attachments
    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Attachment findByName(@RequestParam(name = "studentNumber") String studentNumber, @PathVariable(name="companyId") Long companyId);


}
/**
 * @FeignClient(name="boss", url="http://localhost:1000)
 * public interface FeignBoss {
 * @RequestMapping(method = RequestMethod.POST, value = "students")
 * Student createStudent(
 * @RequestMapping)
 * }
 * **/
