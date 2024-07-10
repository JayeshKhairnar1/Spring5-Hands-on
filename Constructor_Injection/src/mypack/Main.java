package mypack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args)
{
    BeanFactory beanfactory=new ClassPathXmlApplicationContext("injection.xml");
    InjectConstructor ic=(InjectConstructor)beanfactory.getBean("a1");
    System.out.println(ic.getMessage());
    
     InjectConstructor1 ic1=(InjectConstructor1)beanfactory.getBean("a2");
    System.out.println(ic1.getMessage());
    System.out.println(ic1.getNum());

}
}
