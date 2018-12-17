package com.test025;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		

		//Ư�� ��ü�� ������ �Ҹ��� �����ϴ� Spring ���� ��ü �غ�
		//->IoC(Inversion of Control) �����̳�
		//����) Beans.xml ������ com.test005 ��Ű�� �ȿ� ��ġ��Ų��
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test025/Beans.xml");
		
		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean("id�ĺ���") �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorldA obj1 = (HelloWorldA) context.getBean("helloWorldA");
		obj1.getMessage();
		
		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((ClassPathXmlApplicationContext)context).close();

	}

}
