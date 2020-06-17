package com.assessment.service;

import com.assessment.repository.ReverseStringRepository;
import com.assessment.domain.ReverseString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReverseStringService{
    private ReverseStringRepository reverseStringRepository;

    public ReverseStringService(ReverseStringRepository reverseStringRepository) {
        this.reverseStringRepository = reverseStringRepository;
    }

    public void save(ReverseString reverseString)
    {
        try
        {
            reverseStringRepository.save(reverseString);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ReverseString findByInput(String input)
    {
        ReverseString reverseString = new ReverseString();
        try
        {
            reverseString = reverseStringRepository.findByInput(input);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return reverseString;
    }
}
