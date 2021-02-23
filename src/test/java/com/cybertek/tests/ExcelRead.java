package com.cybertek.tests;

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
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


    }

}
