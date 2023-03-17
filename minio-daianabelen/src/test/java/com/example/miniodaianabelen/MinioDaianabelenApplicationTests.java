package com.example.miniodaianabelen;

import com.example.miniodaianabelen.Pages.BasePage;
import com.example.miniodaianabelen.Pages.PageBuy;
import com.example.miniodaianabelen.Pages.RegisterPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MinioDaianabelenApplicationTests {


	WebDriver driver;

	BasePage home;

	RegisterPage register;

	PageBuy buy;

	@BeforeAll
	public void setup() {

		System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.abstracta.us/index.php?route=common/home");

	}


	@Test
	public void testRegister() {

		home = new BasePage(driver);
		home.clickAccount();
		home.clickRegister();
		register = new RegisterPage(driver);
		register.enterFirstName("Steel");
		register.enterLastname("Gray");
		register.enterEmail("aliquam@google.net");
		register.enterPhone("18777535441");
		register.enterPassword("MLL43YXM8QQ");
		register.confirmPassword("MLL43YXM8QQ");
		register.newsletter();
		register.btnContinue();
		String result = register.checkMessage();
		assertTrue(result.contains("Congratulations! Your new account has been successfully created!"));

		System.out.println("Resultado obtenido: " + result);
	}



	@AfterAll
	public void exit() {

		driver.quit();
	}
}
