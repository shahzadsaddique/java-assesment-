package com.assessment.repository;

import com.assessment.domain.Permutation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermutationRepository extends JpaRepository<Permutation, Integer>
{
}
