package com.assessment.service;

import com.assessment.domain.StringShuffling;
import com.assessment.repository.StringShufflingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringShufflingService
{

    private StringShufflingRepository stringShufflingRepository;

    public StringShufflingService(StringShufflingRepository stringShufflingRepository) {
        this.stringShufflingRepository = stringShufflingRepository;
    }

    public StringShuffling save(StringShuffling string)
    {
        return  stringShufflingRepository.save(string);
    }

    public StringShuffling findByInput(String s1, String s2)
    {
        return  stringShufflingRepository.findByS1andS2(s1,s2);
    }

}
