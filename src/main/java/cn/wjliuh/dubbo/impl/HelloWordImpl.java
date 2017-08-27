package cn.wjliuh.dubbo.impl;

import org.springframework.stereotype.Service;

import cn.wjliuh.dubbo.itf.HelloWordInterface;

@Service("dubboservice")
public class HelloWordImpl implements HelloWordInterface {

	@Override
	public String hello(String msg) {
		System.out.println("消费：" + msg);
		return "hello " + msg;
	}
}