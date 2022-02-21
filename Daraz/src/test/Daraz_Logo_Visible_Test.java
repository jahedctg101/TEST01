package test;

import BaseMethod.Base_Daraz;

public class Daraz_Logo_Visible_Test extends Base_Daraz {

	public static void main(String[] args) {
		browser_SetUP("chrome");
//		browser_SetUP(null);
		url_Daraz("https://www.daraz.com.bd/");
		boolean d=isDisplayed("//a[@class='card-platform-campaign-banner-link']/img[@class='image']");
		
		if (d==true) {
			System.out.println("Daraz Logo is Displayed");
		}
		else {
			System.out.println("Daraz Logo is not Displayed");
		}
		
	}//main

}//class
