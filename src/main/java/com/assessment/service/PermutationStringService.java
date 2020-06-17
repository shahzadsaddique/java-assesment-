package com.assessment.service;

import com.assessment.domain.PermutationString;
import com.assessment.repository.PermutationStringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermutationStringService
{
    @Autowired
    PermutationStringRepository permutationStringRepository;

    public PermutationString save(PermutationString permutationString)
    {
        try
        {
            permutationString = permutationStringRepository.save(permutationString);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return permutationString;
    }

    public PermutationString findByInput(String input)
    {
        PermutationString permutationString = new PermutationString();
        try
        {
            permutationString = permutationStringRepository.findByInput(input);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return permutationString;
    }
}
