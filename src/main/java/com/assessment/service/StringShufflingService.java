package com.assessment.service;

import com.assessment.domain.StringShuffling;
import com.assessment.repository.StringShufflingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringShufflingService
{
    @Autowired
    StringShufflingRepository stringShufflingRepository;

    public StringShuffling save(StringShuffling string)
    {
        StringShuffling ss = new StringShuffling();
        try
        {
            ss = stringShufflingRepository.save(string);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ss;
    }

    public StringShuffling findByInput(String s1, String s2)
    {
        StringShuffling  stringShuffling = new StringShuffling();
        try
        {
            stringShuffling = stringShufflingRepository.findByS1andS2(s1,s2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return stringShuffling;
    }

}
