package demo;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wjliuh.dubbo.itf.HelloWordInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Demo extends AbstractJUnit4SpringContextTests {

	public static void main(String[] args) {
		// 这里注意spring配置文件的名字和路径
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml" });
		HelloWordInterface test = (HelloWordInterface) applicationContext
				.getBean("springservice");
		test.hello("我在这里消费！！！");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void start() {
		System.out.println("提供者服务已注册成功");
		applicationContext.getApplicationName();

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
