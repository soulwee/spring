package com.seecen;

import com.seecen.config.MainConfig;
import com.seecen.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        /*
        * ClassPathXmlApplicationContext绑定从classpath下读取配置文件名
        * 加载配置文件就是在初始化BeanFactory,它会区加载所有配置在spring配置文件中
        * 的bean,并且去管理他们的生命周期,(对这些bean指定的类进行对象的创建,使用
        * */
        /*BeanFactory factory= new ClassPathXmlApplicationContext("applicationContext.xml");

        //得到BeanFactory中的某一个bean的对象实例,根据bean的id得到
        User user=(User)factory.getBean("userXm");
        user.show();
        System.out.println(user.getLaogong().get("ljr"));

        UserService u=(UserService)factory.getBean("userService");
        u.deleteUser(1);
        u.findUser();*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        User person = (User)applicationContext.getBean("person");
        System.out.println(person);
        System.out.println( "Hello World!" );
    }
}
