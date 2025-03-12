package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.threads.net/login/");
				
				driver.manage().window().maximize();
				
				/*EdgeDriver driver1 =new EdgeDriver();*/
				String title= driver.getTitle();
				
				System.out.println(title);
				driver.findElement(By.id("placeholder")).sendKeys("shan");
				
			}

	}

