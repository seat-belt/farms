package com.example.handlingformsubmission;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.opencsv.*;
import java.util.Iterator;


public class Greeting {
  private List<String> questions;
  private String id;

  private Map<String, Integer> answers;

  public Map<String, Integer> getAnswers() {
    return answers;
  }

  public void setAnswers(Map<String, Integer> answers) {
    this.answers = answers;
  }

  public List<String> getQuestions() {
    return questions;
  }

  public void setQuestions(List<String> questions) {
    this.questions = questions;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  
  public List<FormData> loadQuestionsFromCSV() {
    List<FormData> formDataList = new ArrayList<>();
    try (InputStream inputStream = getClass().getResourceAsStream("/questions.csv");
         BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
        String line;
        String qType = null;
        while ((line = br.readLine()) != null) {
            if (qType == null) {
                qType = line;
            } else {
                FormData formData = new FormData();
                formData.setQCode("Q" + (formDataList.size() + 1));
                formData.setQType(qType);
                formData.setQText(line);
                formData.setACode(null);
                formDataList.add(formData);
                qType = null;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return formDataList;
}


}