package com.assessment.controller;

import com.assessment.domain.Permutation;
import com.assessment.domain.PermutationString;
import com.assessment.domain.ReverseString;
import com.assessment.domain.StringShuffling;
import com.assessment.repository.ReverseStringRepository;
import com.assessment.service.PermutationStringService;
import com.assessment.service.ReverseStringService;
import com.assessment.service.StringService;
import com.assessment.service.StringShufflingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/string")
public class StringController
{
    @Autowired
    ReverseStringService reverseStringService;

    @Autowired
    PermutationStringService permutationStringService;

    @Autowired
    StringShufflingService stringShufflingService;
    StringService stringService = new StringService();

    @GetMapping("/reverse")
    public ReverseString reverseString(@RequestParam("input") String s)
    {
        ReverseString reverseString;
        reverseString = reverseStringService.findByInput(s);
        if (reverseString != null)
        {
            return reverseString;
        } else
        {
            if (s == null || s.isEmpty())
            {
                return new ReverseString(s, "Invalid input. You must enter a string containing something.");
            } else
            {
                long startedAt = System.nanoTime();
                String result = stringService.reverseString(s);
                long endedAt = System.nanoTime();
                System.out.println("Without cache reverse process took nanosecond: " + (endedAt - startedAt));
                reverseString = new ReverseString(s, result);
                reverseStringService.save(reverseString);
                return reverseString;
            }
        }
    }

    @GetMapping("/permutation/{s}")
    public PermutationString getPermutations(@PathVariable String s)
    {
        PermutationString permutationString;
        permutationString = permutationStringService.findByInput(s);
        if (permutationString != null)
        {
            return permutationString;
        } else
        {
            ArrayList<Permutation> permutations = new ArrayList<>();
            ArrayList<String> permutationList = stringService.getPermutation(s);
            for (String perm : permutationList)
            {
                permutations.add(new Permutation(perm));
            }
            permutationString = new PermutationString(s, permutations);
            permutationString = permutationStringService.save(permutationString);
            return permutationString;
        }
    }

    @GetMapping("/checkShuffled")
    public StringShuffling checkShuffled(@RequestBody StringShuffling object)
    {
        StringShuffling stringShuffling;
        stringShuffling = stringShufflingService.findByInput(object.getS1(), object.getS2());
        if (stringShuffling != null)
        {
            return stringShuffling;
        } else
        {
            if (stringService.isShuffled(object.getS1(), object.getS2(), object.getS3()))
            {
                object.setMessage("Good ! your third String id shuffled of first two Strings.");
                object = stringShufflingService.save(object);
                return object;
            } else {
                object.setMessage("Third String is not shuffled of first two strings.");
                return object;
            }
        }
    }
}
