package com.example.handlingformsubmission;
import com.example.handlingformsubmission.FormData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List; // Add this import statement
import java.util.Map;

@Controller
public class GreetingController {

  @Value("classpath:questions.csv")
  private Resource questionsCsv;
  private List<String> questions;

  @GetMapping("/send")
@ResponseBody
public List<FormData> sendQuestions() {
    Greeting greeting = new Greeting();
    List<FormData> formDataList = greeting.loadQuestionsFromCSV();
    return formDataList;
}


}