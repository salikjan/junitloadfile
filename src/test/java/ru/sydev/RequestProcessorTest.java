package ru.sydev;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for RequestProcessor class.
 */
public class RequestProcessorTest {
    private String content;
    private RequestProcessor requestProcessor;

    // Load JSON content from file
    @Before
    public void init() throws Exception {
        content = IOUtils.toString(
                this.getClass().getResourceAsStream("/input.json"),
                "UTF-8"
        );

        requestProcessor= new RequestProcessor();
    }

    @Test
    public void testGetName() throws IOException {
        assertTrue("John Smith".equals(requestProcessor.getName(content)));
    }
}
