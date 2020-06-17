package com.assessment.repository;

import com.assessment.domain.PermutationString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PermutationStringRepository extends JpaRepository<PermutationString, Integer>
{
    @Query("select ps from PermutationString ps where ps.input = :input")
    PermutationString findByInput(@Param("input") String input);
}
