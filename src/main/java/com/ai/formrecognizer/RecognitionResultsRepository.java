package com.ai.formrecognizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecognitionResultsRepository extends JpaRepository <RecognitionResult, Long> {
    
}
