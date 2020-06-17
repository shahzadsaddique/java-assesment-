package com.assessment.domain;

import javax.persistence.*;

@Entity
@Table(name="string_shuffling")
public class StringShuffling
{
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="s1")
    private String s1;

    @Column(name="s2")
    private String s2;

    @Column(name="s3")
    private String s3;

    @Column(name="message")
    private String message;

    public StringShuffling(String s1, String s2, String s3, String message)
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.message = message;
    }

    public StringShuffling()
    {
    }

    public String getS1()
    {
        return s1;
    }

    public void setS1(String s1)
    {
        this.s1 = s1;
    }

    public String getS2()
    {
        return s2;
    }

    public void setS2(String s2)
    {
        this.s2 = s2;
    }

    public String getS3()
    {
        return s3;
    }

    public void setS3(String s3)
    {
        this.s3 = s3;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "StringShuffling{" +
                "id=" + id +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                '}';
    }
}
