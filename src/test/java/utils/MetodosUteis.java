package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;

public class MetodosUteis {
	
	protected WebDriver driver;
	
	public static void espere(int segundos) {
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void esperarElemento(WebElement elemento) {
		driver = Hooks.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}

	public void selecionar(WebElement elemento, String texto) {
		driver = Hooks.getDriver();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}


}
