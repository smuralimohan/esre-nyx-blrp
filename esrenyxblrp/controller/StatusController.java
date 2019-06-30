package com.paypal.esrenyxblrp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.esrenyxblrp.model.Status;
import com.paypal.esrenyxblrp.repository.StatusRepository;

@RestController
public class StatusController {

    @Autowired
    private StatusRepository statusRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Murali";
    }
    
    @GetMapping("/questions")
    public Page<Status> getQuestions(Pageable pageable) {
        return statusRepository.findAll(pageable);
    }


    @PostMapping("/questions")
    public Status createQuestion(@Valid @RequestBody Status status) {
        return statusRepository.save(status);
    }

//    @PutMapping("/questions/{questionId}")
//    public Status updateQuestion(@PathVariable Long questionId,
//                                   @Valid @RequestBody Status statusRequest) {
//        return statusRepository.findById(questionId)
//                .map(question -> {
//                    //question.setTitle(questionRequest.getTitle());
//                    //question.setDescription(questionRequest.getDescription());
//                    return statusRepository.save(question);
//                }).orElseThrow(IOException::new);
//    }


//    @DeleteMapping("/questions/{questionId}")
//    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
//        return statusRepository.findById(questionId)
//                .map(question -> {
//                	statusRepository.delete(question);
//                    return ResponseEntity.ok().build();
//                }).orElseThrow(ResourceNotFoundException::new);
//    			//}).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
//    }
}
