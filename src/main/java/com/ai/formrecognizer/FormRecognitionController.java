package com.ai.formrecognizer;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormRecognitionController {

    @Autowired
    private RecognitionResultsRepository resultsRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @GetMapping("/results")
    public ModelAndView results() {

        List<RecognitionResult> recognitionResults = resultsRepository.findAll();
        
        ModelAndView modelAndView = new ModelAndView("results");
        modelAndView.addObject("recognitionResults", recognitionResults);        

        return modelAndView;
    }
}
