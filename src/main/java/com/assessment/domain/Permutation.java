package com.assessment.domain;

import javax.persistence.*;

@Entity
@Table(name="permutation")
public class Permutation
{
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="output")
    String output;

//    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn(name = "permutation_string_id")
//    private PermutationString permutationString;

    public Permutation()
    {
    }

    public Permutation(String output)
    {
        this.output = output;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getOutput()
    {
        return output;
    }

    public void setOutput(String output)
    {
        this.output = output;
    }

    @Override
    public String toString()
    {
        return "Permutation{" +
                "id=" + id +
                ", output='" + output + '\'' +
                '}';
    }
}
