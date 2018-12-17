package com.test029;

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
	@Bean()
	public HelloWorldA helloWorldA() {
		HelloWorldA temp = new HelloWorldA();
		/*HelloWorldB ��ü�� ���� �������� ����*/
		temp.setHello(helloWorldB());
		return temp;
	}
	
	@Bean()
	public HelloWorldB helloWorldB() {
		HelloWorldB temp = new HelloWorldB();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}