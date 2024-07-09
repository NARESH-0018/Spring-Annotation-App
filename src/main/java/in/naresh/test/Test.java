package in.naresh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.naresh.config.AppConfig;

public class Test {
   public static void main(String[] args) {
	   
	   ApplicationContext cntx =
			   new AnnotationConfigApplicationContext(AppConfig.class);
}
}
