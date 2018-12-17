package com.test001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		7. AOP ������
		8. �� MVC ���� ����
		*/


		//Spring Console ȯ�� ����
		//->Spring library �߰� ���� �ʿ�
		/*
		C:\externalLibrary\spring-aop-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-aspects-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-beans-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-context-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-context-support-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-core-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-expression-4.1.6.RELEASE.jar
		C:\externalLibrary\commons-logging-1.2.jar
		*/
		
		//������ ��� ����
		/*
		aop : AOP Alliance�� ȣȯ�Ǵ� AOP ������ ����
		aspects : AspectJ���� ������ ����
		asm : ASM ���̺귯���� ����Ű¡ �� ���(asm�� �ڹ� ����Ʈ�ڵ� ���ۿ� ���Ǵ� ���̺귯��)
		beans : BeanFactory �������̽��� ���� ����
		context : core, beans ����� Ȯ�� ����ȭ �̺�Ʈ, ���ҽ� �ε�, ���� �����̳ʸ� ���� ���ؽ�Ʈ �������� ����� �߰��� ����. ApplicationContext �������̽��� ���� ����
		context.support : Ehcache, ���� �����층, UI�� Velocity ���� ����� ���� 
		core : DI ����� ����� �����ӿ�ũ�� ��� ����
		expression : ��ü�� ����, �����ϱ� ���� ǥ���������. JSP 2.1 �Ծ࿡ ��õ� ���� EL Ȯ��
		web : ���Ͼ��ε�, Locale ó���� ���� ���� ���� ���
		web.servlet : ������ MVC ����. JSP, Velocity�� ���� �� ���� ����
		web.struts : �������� ��Ʈ���� ����
		web.portlet : ��Ʋ�� ȯ�濡�� ���Ǵ� MVC ������ ����
		transaction : AOP�� �̿��� ������ Ʈ�����, �ڵ带 �̿��� Ʈ����Ǳ�� ����
		jdbc : JDBC�� ���� �߻� ���̾� ����
		orm : ���̹�����Ʈ, JPA, mybatis, jdo �� orm api�� ���� ���� ���̾� ����. �������� Ʈ����� �������� ���� ����
		oxm : ��ü�� xml ������ ������ ó���ϱ� ���� �߻� ���̾ ����
		jms : jms�� �޽����� �����ϰ� �����ϴ� ����� ����
		test : JUnit�̳� TestNG�� �̿��� ������ ������Ʈ�� �׽�Ʈ ����
		*/
		
		
		
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
		
		//Spring Console ȯ�� ����
		//->Spring library �߰� ���� �ʿ�
		
		//Ư�� ��ü�� ������ �Ҹ��� �����ϴ� Spring ���� ��ü �غ�
		//->IoC(Inversion of Control) �����̳�
		//����) Beans.xml ������ src ���� �ȿ� ��ġ��Ų��
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test001/Beans.xml");
		
		//Ư�� ��ü�� ���� ���ø����̼� ����
		//->Ư�� ��ü ��û�� getBean("id�ĺ���") �޼ҵ� ���
		//����) ����ڴ� Ư�� ��ü�� ������ �Ҹ꿡 �������� �ʴ´�.
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		
		//IoC(Inversion of Control) �����̳� �Ҹ� ��û
		((ClassPathXmlApplicationContext)context).close();

	}

}
