package com.site.blog.my.core.config;

import com.site.blog.my.core.interceptor.AdminLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class MyBlogWebMvcConfigurer implements WebMvcConfigurer {
    @Resource
    private AdminLoginInterceptor adminLoginInterceptor;

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/login").excludePathPatterns("/admin/dist/**")
                .excludePathPatterns("/admin/plugins/**");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
    }
}
