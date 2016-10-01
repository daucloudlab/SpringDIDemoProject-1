package kz.kaznitu.lessons.test;

import kz.kaznitu.lessons.test.classes.CsvOutputGenerator;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class App
{
    public static void main( String[] args )
    {
        IOutputGenerator output = new CsvOutputGenerator();
        output.generateOutput();
    }
}