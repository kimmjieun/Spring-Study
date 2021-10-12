package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class, // hello.core 부터 시작
         excludeFilters = @ComponentScan.Filter( type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
