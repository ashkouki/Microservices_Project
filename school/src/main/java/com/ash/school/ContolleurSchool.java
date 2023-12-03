package com.ash.school;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/School")
@AllArgsConstructor
public class ContolleurSchool {

    @Autowired
private final ServiceSchool serviceSchool;


    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveScools (@RequestBody School school){

        serviceSchool.saveSchool(school);

    }

 @GetMapping

    public ResponseEntity<List<School>> getStudent (){

     return  ResponseEntity.ok(serviceSchool.getSchool());
 }
}
