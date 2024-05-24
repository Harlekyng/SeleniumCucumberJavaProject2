package pages;

public class WebDriverUniversityDropdownPage extends BasePage {

    String languageSelect ="//select[@id='dropdowm-menu-1']";

    public WebDriverUniversityDropdownPage() {
        super (driver);
    }

    public void navToWDUDropdown(){
        navigateTo("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    }
    
    public void selectElementFromDropdown(String opt){
        selectFromDropdownByText(languageSelect, opt);
    }
}
