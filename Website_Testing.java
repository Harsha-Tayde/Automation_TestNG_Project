package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class Website_Testing {
	WebDriver w;
	
	@Test(priority = 1)
	public void register() 
	{
		//TC-1.Launch Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshu\\Desktop\\New folder\\chromedriverupdate.exe");		
		w= new ChromeDriver();
		
		//TC-2.Open the Url
		w.get("http://demo.guru99.com/test/newtours/index.php");
		w.manage().window().maximize();
		
		

		//TC-3.click on register link

		w.findElement(By.linkText("REGISTER")).click();                                
		//TC-4. Fill Register form and click on sumbit button

		w.findElement(By.name("firstName")).sendKeys("Harsha");
		w.findElement(By.name("lastName")).sendKeys("Tayde");
		w.findElement(By.name("phone")).sendKeys("8806789238");
		w.findElement(By.name("userName")).sendKeys("harsha@27");
		w.findElement(By.name("address1")).sendKeys("Shiv nagar");
		w.findElement(By.name("city")).sendKeys("Telhara");
		w.findElement(By.name("state")).sendKeys("Maharashtra");
		w.findElement(By.name("postalCode")).sendKeys("444108");

		//for drop down
		Select s =new Select(w.findElement(By.name("country")));
		// s.selectByValue("BAHAMAS");
		//or
		s.selectByIndex(15);
		//or
		//s.selectByVisibleText("BAHAMAS");


		w.findElement(By.name("email")).sendKeys("harsha@27");
		w.findElement(By.name("password")).sendKeys("12345678");
		w.findElement(By.name("confirmPassword")).sendKeys("12345678");
		w.findElement(By.name("submit")).click();
		System.out.println("Registraion successfully now you can login");
		w.close();
	}
	
	//Tc3-Login with valid data
		@Test(priority = 2)
		public void login() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshu\\Desktop\\New folder\\chromedriverupdate.exe");		
			w= new ChromeDriver();
			
			
			
			
			Thread.sleep(1000);
			w.get("http://demo.guru99.com/test/newtours/index.php");
			w.manage().window().maximize();
			w.findElement(By.name("userName")).sendKeys("harsha@27");
			//7.Enter Valid password
			w.findElement(By.name("password")).sendKeys("12345678");
			//8.Click on submit button
			w.findElement(By.name("submit")).click();
			System.out.println("Login Successfully");
			w.close();
		}
		@Test(priority = 3)
		public void Insurance() 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshu\\Desktop\\New folder\\chromedriverupdate.exe");		
			w= new ChromeDriver();
			
			//Tc-4 Register on insurance module
			
			 w.get("https://demo.guru99.com/insurance/v1/index.php");
			 w.manage().window().maximize();
			 //click on register
			 w.findElement(By.xpath("/html/body/div[3]/a")).click();
			 //title
			 Select t=new Select( w.findElement(By.id("user_title")));
			 t.selectByValue("Miss");
			 //first name
			 w.findElement(By.id("user_firstname")).sendKeys("Neha");
			 //sirname
			 w.findElement(By.id("user_surname")).sendKeys("rathi");
			 //userphone
			 w.findElement(By.id("user_phone")).sendKeys("9876546789");
			 //for year
			 
			 Select t1=new Select(w.findElement(By.id("user_dateofbirth_1i")));
			 t1.selectByValue("1941");
			 //for month
			 Select t2=new Select(w.findElement(By.id("user_dateofbirth_2i")));
			 t2.selectByValue("11");
			 //for date
			 Select t3=new Select(w.findElement(By.id("user_dateofbirth_3i")));
			 t3.selectByValue("20");
			 //radio button
			 w.findElement(By.id("licencetype_f")).click();
			 //licence period
			 Select t4=new Select(w.findElement(By.id("user_licenceperiod")));
			 t4.selectByValue("3");
			 //occuption
			 Select t5=new Select(w.findElement(By.id("user_occupation_id")));
			 t5.selectByValue("12");
			 //address streat
			 w.findElement(By.id("user_address_attributes_street")).sendKeys("Ram Nagar Thane");
			 //city
			 w.findElement(By.id("user_address_attributes_city")).sendKeys("Thane");
			 //country
			 w.findElement(By.id("user_address_attributes_county")).sendKeys("India");
			 //Postel Code
			 w.findElement(By.id("user_address_attributes_postcode")).sendKeys("444238");
			 //email
			 w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("harshatayde27@gmail.com");
			 //password
			 w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("271197");
			//confirmpassword
			 w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("271197");
			 //click on submit
			 w.findElement(By.name("submit")).click();
			
			 
			 
			    //Tc-5: Login  in insurance module after register.
			 
			 w.findElement(By.id("email")).sendKeys("harshatayde27@gmail.com");
			 w.findElement(By.id("password")).sendKeys("271197");
			 w.findElement(By.name("submit")).click();
			 
			 
			 
			 // Tc-5: logout after login in insurance module after
			 w.findElement(By.xpath("/html/body/div[3]/form/input")).click();
			 System.out.println("Insurance done successfully");
			 w.close();
			
		}
		
		// Tc6- click on telecom then back to home click on payment getaway click on new tour module
		@Test(priority = 4)
		public void All_tab_click() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshu\\Desktop\\New folder\\chromedriverupdate.exe");		
			w= new ChromeDriver();
			
			
			
			 w.get("https://demo.guru99.com/test/newtours/login_sucess.php");
			 
			 w.manage().window().maximize();
			 //click on telecom Project
			 w.findElement(By.linkText("Telecom Project")).click();
			 w.navigate().back();
			 Thread.sleep(1000);
			 //click on Payment Gatway
			 w.findElement(By.linkText("Payment Gateway Project")).click();
			 w.navigate().back();
			 //click on new tour
			 w.findElement(By.linkText("New Tours")).click();
			 System.out.println("Project Sucessfully Run");
			 w.close();
			
		}
		
		
		// Tc7- Navigate between the demo tour and orange HRM module
		@Test(priority = 5)
		public void with_two_site() 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darshu\\Desktop\\New folder\\chromedriverupdate.exe");		
			w= new ChromeDriver();
			
			
			
			
			w.get("https://demo.guru99.com/test/newtours/index.php\r\n");
	        //Navigate to orange HRM
			w.manage().window().maximize();
	        
	        w.navigate().to("https://www.orangehrm.com/");
	        w.manage().window().maximize();
	        //check the current url of demoguru
	        
	        
	        w.getCurrentUrl();
	        System.out.println(w.getCurrentUrl());
	        //then refresh the page
	        
	        w.navigate().refresh();
	        //navigate to perious web page
	        w.navigate().forward();
	        
	        w.navigate().back();
	        System.out.println("The navigation of two window successful");
	        
		}
		
		// TC-8: Book  a flight on demotour
		
		
		@Test(priority = 6)
		public void fight() throws InterruptedException 
		{
			w.get("http://demo.guru99.com/test/newtours/index.php");
			w.manage().window().maximize();
          //click on flight
			
		
		 w.findElement(By.linkText("Flights")).click();
		 Thread.sleep(10000);
		 //click on radio button
		 w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		 Select s =new Select(w.findElement(By.name("passCount")));
			//select departing form
			s.selectByValue("3");
			Select s1=new Select(w.findElement(By.name("fromPort")));
			s1.selectByValue("New York");
			//select on month
			Select s2=new Select(w.findElement(By.name("fromMonth")));
			s2.selectByValue("6");
			//select to date
			Select s3=new Select(w.findElement(By.name("toDay")));
			s3.selectByValue("8");
			//select arrving
			Select s4=new Select(w.findElement(By.name("toPort")));
			s4.selectByValue("Portland");
			//return month
			Select s5=new Select(w.findElement(By.name("toMonth")));
			s2.selectByValue("7");
			//return date
			Select s6=new Select(w.findElement(By.name("toDay")));
			s2.selectByValue("9");
			//preferance
			w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
			Select s7=new Select(w.findElement(By.name("airline")));
			s7.selectByVisibleText("Pangea Airlines");
			//click on contiue button
			w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
			
			System.out.println("Your flight booking successfully");
	

			
		}
		

	
	
	
	
	
	
	
	
	
}
