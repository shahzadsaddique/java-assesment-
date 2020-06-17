package com.assessment.service;

import com.assessment.domain.PermutationString;
import com.assessment.repository.PermutationStringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermutationStringService{
    PermutationStringRepository permutationStringRepository;

    public PermutationString save(PermutationString permutationString)    {
        return  permutationString = permutationStringRepository.save(permutationString);
    }

    public PermutationString findByInput(String input)
    {
      return permutationStringRepository.findByInput(input);
    }
}
