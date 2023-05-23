package com.supportportal.service;


import com.supportportal.domain.MedExam;
import com.supportportal.repository.MedExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedExamService {
    private MedExamRepository medExamRepository;
    public List<MedExam> getMedExam(){
        return  medExamRepository.findAll();
    }

}
