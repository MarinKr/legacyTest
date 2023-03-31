package config;




import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
	  ContextDataSource.class
	, ContextSqlMapper.class
	})
@ComponentScan(basePackages = {"com.goott.test.service.impl"}) // 서비스 Bean 검색스캔 예시
public class RootContext {
	

}
