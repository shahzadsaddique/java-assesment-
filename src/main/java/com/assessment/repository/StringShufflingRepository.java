package com.assessment.repository;

import com.assessment.domain.StringShuffling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StringShufflingRepository extends JpaRepository<StringShuffling, Integer>
{
    @Query("select ss from StringShuffling ss where ss.s1 = :s1 and ss.s2 = :s2")
    StringShuffling findByS1andS2(String s1, String s2);
}
