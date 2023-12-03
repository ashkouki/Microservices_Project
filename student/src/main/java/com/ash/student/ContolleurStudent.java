package com.ash.student;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ContolleurStudent {

    @Autowired
private final ServiceStudent service;


 @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
 public void saveStudent (@RequestBody Student student){


     service.saveStudent(student);
 }
 @GetMapping

    public ResponseEntity<List<Student>> getStudent (){

     return  ResponseEntity.ok(service.getStudent());
 }
}
