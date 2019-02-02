package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//without spring
		//Triangle triangle = new Triangle();
		
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
	}

}
