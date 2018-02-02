package ru.sydev;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class RequestProcessor {
    private ObjectMapper mapper = new ObjectMapper();

    public String getName(String input) throws IOException {
        JsonNode node = mapper.readTree(input);
        return node.get("name").textValue();
    }
}
