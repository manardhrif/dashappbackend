package com.supportportal.resource;

import com.supportportal.domain.MedExam;
import com.supportportal.service.MedExamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class MedExamController {
    private MedExamService medExamService;
    @GetMapping("/MedExam")
    private List<MedExam> getMedExam(){
        return medExamService.getMedExam();
    }
}
