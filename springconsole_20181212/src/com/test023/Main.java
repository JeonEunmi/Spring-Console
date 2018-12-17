package com.test023;

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
		//����) Beans.xml ������ com.test023 ��Ű�� �ȿ� ��ġ��Ų��
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test023/Beans.xml");

		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean("id�ĺ���") �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorldA obj1 = (HelloWorldA) context.getBean("helloWorldA");

		//HelloWorldA ��ü�� getMessage() �޼ҵ� ȣ��
		//->���������δ� HelloWorldB ��ü�� getMessage() �޼ҵ尡 ȣ��ȴ�.
		obj1.getMessage();

		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((ClassPathXmlApplicationContext)context).close();
	
	}

}