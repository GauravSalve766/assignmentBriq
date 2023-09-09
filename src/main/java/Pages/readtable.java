package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class readtable extends TestBase{

	// Find the table element by its XPath
//	@FindBy(xpath = "//div[@class='large-10 columns']//table") private WebElement table;
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	public void verifytable_read() throws Exception{
		

		Thread.sleep(4000);
		WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='large-10 columns']//table")));
		

        // Get all rows from the table
        List<WebElement> rows = table.findElements(By.xpath("//tr"));
        
     // Create a List to store table data
        List<List<String>> tableData = new ArrayList<List<String>>();

        // Iterate through each row
        for (WebElement row : rows) {
            List<String> rowData = new ArrayList<String>();
            // Get all columns in the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                // Add each column's text to the rowData list
                rowData.add(column.getText());
            }
            // Add the rowData to the tableData list
            tableData.add(rowData);
        }

        // Print the table data to the console
        for (List<String> rowData : tableData) {
            System.out.println(rowData);
        }

	}
}
