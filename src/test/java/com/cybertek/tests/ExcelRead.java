package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    /*
    In this test we will be reading from excel file
     */

    @Test
    public void excel_read_test() throws IOException {

        String path = "SampleData.xlsx";

        //To be able to read from excel file we need to load the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet > row > cell

        //We created workbook instance and loaded with "SampleData" file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //Create the sheet and pass the name of the sheet we want to work on
        XSSFSheet sheet = workbook.getSheet("Employees");

        //ROW --> SHEET
        //Print out "Steven" from excel sheet
        System.out.println(sheet.getRow(1).getCell(0));

        //Print out "Singer" from excel sheet
        System.out.println(sheet.getRow(3).getCell(2));







    }

}
