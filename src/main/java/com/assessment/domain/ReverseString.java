package com.assessment.domain;

import javax.persistence.*;

@Entity
@Table(name="reverse_string")
public class ReverseString
{
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="input")
    private String input;

    @Column(name="output")
    private String output;

    public ReverseString()
    {
    }

    public ReverseString(String input, String output)
    {
        this.input = input;
        this.output = output;
    }

    public String getInput()
    {
        return input;
    }

    public void setInput(String input)
    {
        this.input = input;
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
        return "ReverseString{" +
                "id=" + id +
                ", input='" + input + '\'' +
                ", output='" + output + '\'' +
                '}';
    }
}

