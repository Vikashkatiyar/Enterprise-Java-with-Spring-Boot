package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Flipkart;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.shopping(new String[] { "fossil", "puma", "iphone" },
				new float[] { 35000.5f, 56000.0f, 75000.35f }));

	}
}
