package ru.sydev;

public class App
{
    public static void main( String[] args ) throws Throwable {
        String jsonString = "{\"name\":\"John Smith\",\"age\":\"99\"}";
        System.out.println(new RequestProcessor().getName(jsonString));
    }
}
