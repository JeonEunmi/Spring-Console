package com.test027;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		
		//Spring Framework �۵� ����
		/*
		1. �������� ����ϴ� �޸� ���� �غ�
		   - ApplicationContext
		2. �����ϰ��� �ϴ� ��ü�� ���� ���� Ȯ�ο� ���� ����
		   - .java ���� (@Configuration ������̼�)
		3. ���� ������ �ٰŷ� ��ü Ž�� �� ��ü ����
		4. Ư�� ��ü�� �ٸ� ��ü�� �ʿ�� �ϴ� ��� �������� ����
		5. Ư�� ��ü�� ���� ���ø����̼� ����
		*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean(Ŭ���� ����) �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorld obj1 = (HelloWorld) context.getBean(HelloWorld.class);
		HelloWorld obj2 = (HelloWorld) context.getBean(HelloWorld.class);
		
		// �ؽ��ڵ尡 ������ ���� ��ü, �ٸ��� �ٸ� ��ü
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		obj1.getMessage();
		obj2.getMessage();
		
		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((AnnotationConfigApplicationContext)context).close();

	}

}
