package ru.mylov;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(ExcelReader.getExcelReader().readStudents());
        System.out.println("");
        System.out.println(ExcelReader.getExcelReader().readUniversities());
    }
}