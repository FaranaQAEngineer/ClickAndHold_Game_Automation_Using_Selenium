package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Gametestclickandhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		d.manage().window().maximize();

		Thread.sleep(2000);
		
		Actions a=new Actions(d);
		
		WebElement tileA=d.findElement(By.xpath("//li[contains(.,'A')]"));
		WebElement tileB=d.findElement(By.xpath("//li[contains(.,'B')]"));
		WebElement tileC=d.findElement(By.xpath("//li[contains(.,'C')]"));
		WebElement tileD=d.findElement(By.xpath("//li[contains(.,'D')]"));
		WebElement tileE=d.findElement(By.xpath("//li[contains(.,'E')]"));
		WebElement tileF=d.findElement(By.xpath("//li[contains(.,'F')]"));
		WebElement tileG=d.findElement(By.xpath("//li[@name='G']"));
		WebElement tileH=d.findElement(By.xpath("//li[@name='H']"));
		WebElement tileI=d.findElement(By.xpath("//li[@name='I']"));
		WebElement tileJ=d.findElement(By.xpath("//li[@name='J']"));
		WebElement tileK=d.findElement(By.xpath("//li[@name='K']"));
		WebElement tileL=d.findElement(By.xpath("//li[@name='L']"));
		
		Thread.sleep(2000);

		Action ab=a.clickAndHold(tileB).moveToElement(tileA).release(tileB).build();
		ab.perform();

		Action cd=a.clickAndHold(tileD).moveToElement(tileC).release(tileD).build();
		cd.perform();
		
		Action ef=a.clickAndHold(tileF).moveToElement(tileE).release(tileF).build();
		ef.perform();
		
		Action gh = a.clickAndHold(tileH).moveToElement(tileG).release(tileH).build();
		gh.perform();
		
		Action ij=a.clickAndHold(tileJ).moveToElement(tileI).release(tileJ).build();
		ij.perform();
		
		Action kl= a.clickAndHold(tileL).moveToElement(tileK).release(tileL).build();
		kl.perform();
		
		
	}

}
