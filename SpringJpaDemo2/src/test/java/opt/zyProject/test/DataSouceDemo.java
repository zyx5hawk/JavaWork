package opt.zyProject.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSouceDemo {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("print");
		// TestService testService = (TestService)
		// applicationContext.getBean("testService");
		// testService.Save();
	}
}
