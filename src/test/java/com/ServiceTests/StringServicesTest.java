package com.ServiceTests;

import com.assessment.service.StringService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StringServicesTest
{

    StringService stringService = new StringService();
    @Test
    public void testReverseString()
    {
        String result = stringService.reverseString("muzi");
        Assert.assertEquals("izum", result);
    }

    @Test
    public void testShufflingString()
    {
        boolean result = stringService.isShuffled("abc", "def", "dabecf");
        Assert.assertEquals(true, result);
    }
}
