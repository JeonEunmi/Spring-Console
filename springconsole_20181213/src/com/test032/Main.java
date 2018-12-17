package com.test032;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

		
		//Ư�� ��ü�� ������ �Ҹ��� �����ϴ� Spring ���� ��ü �غ�
		//->IoC(Inversion of Control) �����̳�
		ApplicationContext context 
			= new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean(Ŭ��������) �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorldA obj1 = (HelloWorldA) context.getBean(HelloWorldA.class);
		
		//HelloWorldA ��ü�� getMessage() �޼ҵ� ȣ��
		//->���������δ� HelloWorldB ��ü�� getMessage() �޼ҵ尡 ȣ��ȴ�.
		obj1.getMessage();

		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((AnnotationConfigApplicationContext)context).close();
	
	}

}
