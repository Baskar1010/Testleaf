package week3.day4.assesmant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebook {
public static void main(String[] args) {
	
	ChromeDriver drive=new ChromeDriver();
	
	
	
	drive.get("https://www.facebook.com/");
	
	drive.manage().window().maximize();
	
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	drive.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	drive.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Baskar");
	
	drive.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Baskar");
	
	drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080556404");
	
	//drive.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("9080556404");
	
	drive.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ASd##fg9876");
	
	drive.findElement(By.xpath("//label[text()='Male']")).click();
	
	WebElement Day =drive.findElement(By.xpath("//select[@name='birthday_day']/."));
	
	Select DayDropDown=new Select(Day);
	
	DayDropDown.selectByIndex(19);
	
	
	
	
	
    WebElement Month =drive.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Select MonthDropDown=new Select(Month);
	
	MonthDropDown.selectByVisibleText("Jun");
	
	WebElement Year= drive.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Select YearDropDown=new Select(Year);
	
	YearDropDown.selectByValue("2000");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}







