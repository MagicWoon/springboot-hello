package com.wh.springboothello01.config;

import com.wh.springboothello01.filter.Myfilter;
import com.wh.springboothello01.interceptor.MyInterceptor;
import com.wh.springboothello01.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * User: Magic Woo
 * Date: 2019/6/3
 * Time: 16:58
 * version 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private Myfilter myfilter;
    @Autowired
    private MyListener myListener;
    @Autowired
    private MyInterceptor myInterceptor;

    @Bean
    public FilterRegistrationBean initFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(myfilter);
        registrationBean.setName("MyFilter");
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean getListenerBean(){
        ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean();
        listenerBean.setListener(myListener);
        return listenerBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }


}
