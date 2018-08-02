/**
 * 
 */
package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.deloitte.pojos.HelloIndia;
import com.deloitte.pojos.HelloWorld;
import com.deloitte.pojos.Point;
import com.deloitte.pojos.TextEditor;

/**
 * @author Tva0091
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Point point1=(Point)context.getBean("pointBean");
		System.out.println(point1);
		Point point2=(Point)context.getBean("pointBean");
		System.out.println(point2);
		point2.setX(5);
		point2.setY(10);
		System.out.println(point1);
		HelloWorld helloworld=(HelloWorld)context.getBean("helloWorld");
		helloworld.getMessage1();
		helloworld.getMessage2();
		HelloIndia helloindia=(HelloIndia)context.getBean("helloIndia");
		helloindia.getMessage1();
		helloindia.getMessage2();
		helloindia.getMessage3();
		TextEditor te1=(TextEditor)context.getBean("textEditorCDI");
		te1.spellCheck();
		TextEditor te2=(TextEditor)context.getBean("textEditorSDI");
		te2.spellCheck();
		TextEditor te3=(TextEditor)context.getBean("textEditorAWbN");
		te3.spellCheck();
		TextEditor te4=(TextEditor)context.getBean("textEditorAWbT");
		te4.spellCheck();
		TextEditor te5=(TextEditor)context.getBean("textEditorAWbT");
		te5.spellCheck();
		te5.getName();
		// TODO Auto-generated method stub

	}

}
