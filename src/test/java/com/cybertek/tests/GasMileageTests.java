package com.cybertek.tests;

import com.cybertek.pages.GasMileageCalculatorPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.hu.De;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class GasMileageTests {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    GasMileageCalculatorPage gasMileageCalculatorPage = new GasMileageCalculatorPage();

    @Test
    public void gas_mileage_calculation() throws IOException {

        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html");

        //Get the path from Content Root
        String path = "src/test/resources/testData/GasMileageTestData.xlsx";

        //loading the file into inputStream object
        fileInputStream = new FileInputStream(path);

        //loading the workbook to the class
        workbook = new XSSFWorkbook(fileInputStream);

        //opening sheet
        sheet = workbook.getSheet("Sheet1");

        //===========================================================================
        //entering current odometer reading
        double current = 123000;

        //Clearing the input box before entering any data
        gasMileageCalculatorPage.inputCurrentOdo.clear();

        //We need to pass 'double' into input box
        gasMileageCalculatorPage.inputCurrentOdo.sendKeys(String.valueOf(current));

        //===========================================================================
        //Entering previous odometer reading
        double previous = 122000;

        gasMileageCalculatorPage.inputPreviousOdo.clear();
        gasMileageCalculatorPage.inputPreviousOdo.sendKeys(String.valueOf(previous));

        //===========================================================================
        //Entering how many gallons of gas used
        double gas = 70;

        gasMileageCalculatorPage.inputGas.clear();
        gasMileageCalculatorPage.inputGas.sendKeys(String.valueOf(gas));

        //===========================================================================
        //Click to calculate button

        gasMileageCalculatorPage.calculateButton.click();

        //How does the calculation of AVG/MPG work
        // (current-previous)/gallons --> avg MPG

        double expectedResult = (current-previous)/gas;

        System.out.println("expectedResult = " + expectedResult);


        //actual result --> 14.29 mpg --> split " " --> {"14.29", "mpg"}
        String[] actualResultArr = gasMileageCalculatorPage.resultInGas.getText().split(" ");
        System.out.println("actualResultArr = " + actualResultArr[0]);


        String actual = actualResultArr[0];
        String expected = String.valueOf(expectedResult);

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String formattedExpected = decimalFormat.format(expectedResult);

        System.out.println("formattedExpected = " + formattedExpected);

        if (actual.equals(formattedExpected)){
            System.out.println("PASS!");
        }else{
            System.out.println("FAIL!");
        }




    }

}
