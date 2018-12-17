package com.test003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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
		   - FileSystemXmlApplicationContext
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
		//����) Beans.xml ������ ������ ���� ���(ex ->  c:\conf) �ȿ� ��ġ �Ѵ�. (���ϴ� ��ġ)
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\conf\\Beans.xml");
		
		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean("id�ĺ���") �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		
		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((FileSystemXmlApplicationContext)context).close();

	}

}
