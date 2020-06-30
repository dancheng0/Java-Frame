package annotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }

    /**
     * @Bean注解注册bean,同时可以指定初始化和销毁方法
     * @Bean(name="testBean",initMethod="start",destroyMethod="cleanUp")
     * @return
     */
    @Bean
    @Scope("prototype")
    public TestBean testBean() {
        return new TestBean();
    }
}