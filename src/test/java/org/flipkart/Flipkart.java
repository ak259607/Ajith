package org.flipkart;

import java.util.List;

import org.base2.Base2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkart extends Base2 {
	
	public static void main(String[] args) {
		
		browserLaunch("https://www.flipkart.com/dotd-store?=Web&wid=4.dealCard.OMU_3&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_3&otracker1=hp_omu_SECTIONED_manualRanking_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_wc_view-all_3");
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_10pg75']"));
		
		int size = elements.size();
		System.out.println(size);
		
		
		
		
	}
	
	

}
