package com.example.demo;

import com.example.demo.models.Appointment;
import com.example.demo.models.Attachment;
import com.example.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FeignRun implements CommandLineRunner {

    private final FeignClient feignClient;

    public FeignRun(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public void run(String... args) throws Exception {

         //Registering a student - ID = 20
        Student reg = feignClient.registerStudent(new Student("91375", "Adrian"));
        System.out.println("Created student: " + reg);
        //finding attachment
        Attachment find = feignClient.findByName("91375");
        System.out.println("attachment: " + find);


}
