package com.test028;

import org.springframework.context.annotation.Bean;

/*
 * @configuration ������̼��� ����ؼ� ȯ�� ���� ������
 * Java �ڵ�� ǥ���Ѵ�.
 * beans.xml ��� ����ϴ� ���!
 */
public class HelloWorldConfig {

	/*
	 * ������ �����ӿ�ũ�� ������ Ŭ���� ���� ���� -> @Bean ������̼� ���
	 * setter ��� �������� ���� -> setter �޼ҵ� ȣ�� �� �Ű������� ���ؼ� ����
	 */
	@Bean(initMethod="init", destroyMethod="destroy")
	public HelloWorld helloWorld() {
		HelloWorld temp = new HelloWorld();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}
