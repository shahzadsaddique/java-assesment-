package com.assessment.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="permutation_string")
public class PermutationString
{
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="input")
    private String input;

     @OneToMany(fetch = FetchType.LAZY,
            cascade = { CascadeType.PERSIST, CascadeType.DETACH,
                        CascadeType.MERGE, CascadeType.REFRESH})
    private List<Permutation> permutations;


    public PermutationString(String input, List<Permutation> permutations)
    {
        this.input = input;
        this.permutations = permutations;
    }

    public PermutationString()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public List<Permutation> getPermutations()
    {
        return permutations;
    }

    public void setPermutations(List<Permutation> permutations)
    {
        this.permutations = permutations;
    }

    public String getInput()
    {
        return input;
    }

    public void setInput(String input)
    {
        this.input = input;
    }

    @Override
    public String toString()
    {
        return "PermutationString{" +
                "id=" + id +
                ", input='" + input + '\'' +
//                ", permutations=" + permutations +
                '}';
    }
}
