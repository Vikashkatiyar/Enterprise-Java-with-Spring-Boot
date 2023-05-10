package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.PersonInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		
		PersonInfo personInfo1 = factory.getBean("per1", PersonInfo.class);
		System.out.println(personInfo1);
		
		System.out.println();
		
		PersonInfo personInfo2= factory.getBean("per2", PersonInfo.class);
		System.out.println(personInfo2);

	}
}
