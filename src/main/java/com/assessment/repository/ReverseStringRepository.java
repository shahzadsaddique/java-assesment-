package com.assessment.repository;

import com.assessment.domain.ReverseString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReverseStringRepository extends JpaRepository<ReverseString, Integer>
{
    @Query("select rs from ReverseString rs where rs.input = :input")
ReverseString findByInput(@Param("input") String input);
}
