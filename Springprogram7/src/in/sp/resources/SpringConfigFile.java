package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration

public class SpringConfigFile {
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("kdp");
		addr.setPincode(754245);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student str = new Student();
		str.setRollno(13);
		str.setName("Binod");
		str.setAddress(createAddObj());
		return str;
	}
	
	

}
