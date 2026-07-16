package in.sp.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.sp.beans.Student;

public class Main {
	
	public static void main(String[]args) {
		String resources_file_path = "in/sp/resources/applicationContext.xml";
		
	ApplicationContext context = new ClassPathXmlApplicationContext(resources_file_path );
	Student std = context.getBean("student",Student.class);
	std.display();
	}

}
