package com.test004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		//Spring Framework �۵� ����
		/*
		1. �������� ����ϴ� �޸� ���� �غ�
		   - ApplicationContext
		2. �����ϰ��� �ϴ� ��ü�� ���� ���� Ȯ�ο� ���� ����
		   - xml
		3. ���� ������ �ٰŷ� ��ü Ž�� �� ��ü ����
		4. Ư�� ��ü�� �ٸ� ��ü�� �ʿ�� �ϴ� ��� �������� ����
		5. Ư�� ��ü�� ���� ���ø����̼� ����
		*/
		

		//Ư�� ��ü�� ������ �Ҹ��� �����ϴ� Spring ���� ��ü �غ�
		//->IoC(Inversion of Control) �����̳�
		//����) Beans.xml ������ com.test004 ��Ű�� �ȿ� ��ġ��Ų��
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test004/Beans.xml");
		
		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean("id�ĺ���") �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		
		//java.lang.ClassCastException: com.test001.HelloWorld cannot be cast to com.test004.HelloWorld
		//���������� ���� �������� HelloWorld�� com.test001.HelloWorld �̴�.
		//->����ȯ�ϰ��� �ϴ� HelloWorld�� com.test004.HelloWorld �̴�.
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		
		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((ClassPathXmlApplicationContext)context).close();

	}

}
