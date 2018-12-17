package com.test031;

import org.springframework.beans.factory.annotation.Autowire;
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
	
	
	/*
	@Bean ������̼� ���
	Spring Autowiring 'byName'
	-> �ĺ��ڰ� ��ġ�ϴ� ��ü�� Ž���ؼ� �ڵ� ����
	*/
	@Bean(autowire=Autowire.BY_NAME)
	public HelloWorldA helloWorldA() {
		/*HelloWorldB ��ü�� ���� �������� ����*/
		HelloWorldA temp = new HelloWorldA( helloWorldB() );
		return temp;
	}
	
	@Bean()
	public HelloWorldB helloWorldB() {
		HelloWorldB temp = new HelloWorldB();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}
