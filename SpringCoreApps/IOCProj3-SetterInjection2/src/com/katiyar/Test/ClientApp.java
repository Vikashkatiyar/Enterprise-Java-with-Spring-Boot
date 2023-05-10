package com.katiyar.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;



import com.katiyar.bean.UniversityInfo;

public class ClientApp {

	public static void main(String[] args) {
		
      DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
      XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
      reader.loadBeanDefinitions("src\\applicationContext.xml");
      
      //Map object is Injected
      
       UniversityInfo info=factory.getBean("university",UniversityInfo.class);
       System.out.println(info);
	}

}