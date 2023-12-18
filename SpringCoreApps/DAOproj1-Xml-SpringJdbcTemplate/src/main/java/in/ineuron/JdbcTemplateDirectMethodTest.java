package in.ineuron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.service.IEmployeeManagementService;

/**
 * vikash katiyar 1:48:06
 *
 */

public class JdbcTemplateDirectMethodTest 
{
    public static void main( String[] args )
    {
    	System.out.println("Jai Shree Ram");
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
        
        IEmployeeManagementService service=applicationContext.getBean(IEmployeeManagementService.class);
        System.out.println(service);
        
        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
