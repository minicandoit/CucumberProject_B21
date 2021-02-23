package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class GasMileageCalculatorPage {

    public GasMileageCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
