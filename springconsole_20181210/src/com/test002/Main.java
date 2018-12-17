package com.test002;

import org.springframework.beans.factory.InitializingBean; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource;  

public class Main {

	public static void main(String[] args) {
		
		//Spring Framework
		/*
		1. Java ��� ���� ���α׷� �ۼ��� ����� �Ǵ� ����
		2. �淮 �����ӿ�ũ - �⺻���� Ʋ�� �����ϰ�, ������ ��� �߰��� ����� ����
		3. �ٸ� �����ӿ�ũ ���� ��� ����
		4. ������Ʈ ��ü�� �⺻ ���� ����
		5. POJO ����� ����
		6. ������ ����(DI)�� ���� ��ü�� ���� ����
		7. AOP ����
		8. �� MVC ���� ����
		*/

		
		//Spring Framework �۵� ����
		/*
		1. �������� ����ϴ� �޸� ���� �غ�
		   - Spring BeanFactory Container
		2. �����ϰ��� �ϴ� ��ü�� ���� ���� Ȯ�ο� ���� ����
		   - xml
		3. ���� ������ �ٰŷ� ��ü Ž�� �� ��ü ����
		4. Ư�� ��ü�� �ٸ� ��ü�� �ʿ�� �ϴ� ��� �������� ����
		5. Ư�� ��ü�� ���� ���ø����̼� ����
		*/
		
		//Spring Console ȯ�� ����
		//->Spring library �߰� ���� �ʿ�
		
		//Ư�� ��ü�� ������ �Ҹ��� �����ϴ� Spring ���� ��ü �غ�
		//->IoC(Inversion of Control) �����̳�
		//����) Beans.xml ������ src ���� �ȿ� ��ġ��Ų��
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("com/test002/Beans.xml"));
		
		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean("id�ĺ���") �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");   
		obj.getMessage();
		
		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		
		
		

	}

}
