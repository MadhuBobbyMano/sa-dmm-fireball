package com.premierinc.dmmapp.configuration;

import com.premierinc.dmmapp.interceptor.OrganizationAccessInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;


@Configuration
public class SpringConfig implements WebMvcConfigurer {

    private static final String SERVICE_URL_PATTERN = "/services/**";

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(organizationAccessInterceptor())
                .addPathPatterns(SERVICE_URL_PATTERN);
    }

    @Bean
    public OrganizationAccessInterceptor organizationAccessInterceptor() {
        return new OrganizationAccessInterceptor();
    }

}
