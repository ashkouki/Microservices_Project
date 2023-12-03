package com.ash.school;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceSchool {

    @Autowired
    private  final SchoolSchool repo;


    public void saveSchool(School school){

        repo.save(school);
    }

    public List<School> getSchool (){
        return repo.findAll();
    }

}
