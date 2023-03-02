package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\PSA3001\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");

		driver.findElement(By.className("VJZDxU")).sendKeys("123456789");

		// Thread.sleep(4000);

		driver.findElement(By.className("_2doB4z")).click();

		// Thread.sleep(3000);

		driver.findElement(By.className("_3704LK")).sendKeys("iphone" + Keys.ENTER);
		driver.get(
				"https://www.flipkart.com/search?q=iphone&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_HistoryAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone%7CMobiles&requestId=a579e873-4e58-4357-b1a4-8af404050f8d&as-backfill=on");
		
		String iphoneActualTitle = driver.getTitle();
		String iphoneExpectedTitle = "Iphone- Buy Products Online at Best Price in India - All Categories | Flipkart.com";

		if (iphoneActualTitle.equalsIgnoreCase(iphoneExpectedTitle))
			System.out.println("Title Matched in 2nd page");
		else
			System.out.println("Title didn't match in 2nd page");

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']")));

		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']")).click();

		driver.get(
				"https://www.flipkart.com/apple-iphone-11-black-128-gb/p/itm8244e8d955aba?pid=MOBFWQ6BKRYBP5X8&lid=LSTMOBFWQ6BKRYBP5X8IBG6BS&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_HistoryAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_1_1_na_na_na&fm=organic&iid=b3ed4679-c812-442b-8050-3acf627bd6a9.MOBFWQ6BKRYBP5X8.SEARCH&ppt=hp&ppn=homepage&ssid=ge09vybim80000001677741977987&qH=0b3f45b266a97d70");
		List<WebElement> p = driver.findElements(By.xpath("//ul[@class='_1q8vHb']/li/a/div/img"));
		int s = p.size();

		System.out.println("Total " + s + " colors");
        
		boolean size = driver.findElement(By.id("swatch-0-storage")).isDisplayed();
        if(size) {
        	System.out.println("size 64");
        }
        else {
        	System.out.println("no size");
        }
        
        
        boolean size2 = driver.findElement(By.id("swatch-1-storage")).isDisplayed();
        if(size2) {
        	System.out.println("size 128 gb");
        }
        else {
        	System.out.println("no size 128 gb");
        }
        
		String page3 = driver.getTitle();
		String expPage3 = "APPLE iPhone 11 ( 128 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
		if(page3.equalsIgnoreCase(expPage3)) {
			System.out.println("Title matched in 3rd page");
		}
		else {
			System.out.println("Title not matched in 3rd page");
		}
		
		WebElement t = driver.findElement(By.xpath("//a[text()='128 GB']"));
		
		String actualText = t.getText();
		String expectedText = "128 GB"; 
		
		if(actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("yes :')");
		}
		else {
			System.out.println("no :(");
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='128 GB']")));
		
		//choosing size
		driver.findElement(By.xpath("//a[text()='128 GB']")).click();
		
		//choosing color
		driver.findElement(By.id("swatch-3-color"));
		 
		//cart
		wait.until(ExpectedConditions.elementToBeClickable(By.className("_3SkBxJ")));
		driver.findElement(By.className("_3SkBxJ")).click(); 
		
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		 
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();

	}
}
