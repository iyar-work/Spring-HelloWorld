import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        bean1.setMessage("not hallo");
        System.out.println(bean.getMessage().equals(bean1.getMessage()));
        System.out.println(bean.getMessage() + "  " + bean1.getMessage());

        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        bean3.setName("qwer");
        System.out.println(bean2.getName().equals(bean3.getName()));
        System.out.println(bean2.getName() + "  " + bean3.getName());
    }
}