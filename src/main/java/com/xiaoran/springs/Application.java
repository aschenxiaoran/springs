package com.xiaoran.springs;

import com.xiaoran.springs.autowireds.AutowiredBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class Application {

    @Autowired(required = false)
    @Qualifier("JaveAutoaireBeanService")
    private AutowiredBeanService autowiredBeanService;

    public static void main(String[] args)  throws IOException {


       /* ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        BeanList beanList=(BeanList) context.getBean("BeanList");
        System.out.println(beanList);*/

        Properties prop=new Properties();
        //创建输入流，用来读取文件
        InputStream is=new FileInputStream("C:/xiaoran/java/code/xiaoran-springs/src/bean.properties");
        prop.load(is);//将流载入到Prop中，这时候文件里面的键值对已经读取到内存中了
        /*
        这句话是用来指定将内存中的键值对输出到控制台
        当然也可以指定到其他的路径，比如文件中
         */
        prop.list(System.out);


        /*ApplicationContext context=new AnnotationConfigApplicationContext("com.gofun.infrastructure.elasticsearch");


        Order order1= SpringUtils.getBean(Order.class);
        String userName=order1.getUserName();


        Order order=context.getBean(Order.class);
        System.out.println("测试"+order.getUserName());
*/
        SpringApplication.run(Application.class, args);
    }

}
