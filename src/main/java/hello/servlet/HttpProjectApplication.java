package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan //현재 패키지 포함 하위패키지의 서블릿을 찾아 등록한다.
@SpringBootApplication
public class HttpProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpProjectApplication.class, args);
    }

    @Bean
    ViewResolver internalResourceViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }
}
