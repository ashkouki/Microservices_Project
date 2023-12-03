package com.ash.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceStudent {
    @Autowired
    private  final StudentRepository repo;


    public void saveStudent (Student student){

        repo.save(student);
    }

    public List<Student> getStudent (){
        return repo.findAll();
    }

}
