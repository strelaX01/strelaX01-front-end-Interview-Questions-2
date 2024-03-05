package demo.testsele;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver","geckodriver.exe");

	        // Khởi tạo trình điều khiển WebDriver cho trình duyệt Firefox
	        WebDriver driver = new FirefoxDriver();
	        
	        // Địa chỉ URL của trang web cần kiểm tra title
	        String baseUrl = "https://strelax01.github.io/front-end-Interview-Questions-2/";
	        
	        // Giá trị mong đợi của title
	        String expectedTitle = "front end Interview";
	        
	        // Mở trang web
	        driver.get(baseUrl);
	        
	        // Lấy title thực tế của trang
	        String actualTitle = driver.getTitle();
	        
	        // So sánh title thực tế với title mong đợi và in ra kết quả
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed! Title chinh xac.");
	        } else {
	            System.out.println("Test Failed! Title sai.");
	        }
	        
	        // Đóng trình duyệt
	        driver.quit();
	}

}
