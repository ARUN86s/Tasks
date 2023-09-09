package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task22 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//input[@class='first_name form-control']")).sendKeys("arun");
		driver.findElement(By.xpath("//input[@class='last_name form-control']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@class='business_name form-control']")).sendKeys("GUVI");
		driver.findElement(By.xpath("//input[@class='email form-control']")).sendKeys("s.arunkumarmba@gmail.com");
		WebElement element1 = driver.findElement(By.xpath("//span[@id='numb1']"));
		String a = element1.getText();
		WebElement element2 = driver.findElement(By.xpath("//span[@id='numb2']"));
		String b= element2.getText();
		int num1 =Integer.parseInt(a);  
		int num2 =Integer.parseInt(b);  
	    int answer= num1+num2;
	    String result=String.valueOf(answer);  
		driver.findElement(By.xpath("//input[@class='form-control w-100']")).sendKeys(result);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg w-100']")).click();
		
		
	}

}
