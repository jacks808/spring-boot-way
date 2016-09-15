package com.beenoisy.springboot.way.common.config.converter;

import com.beenoisy.springboot.way.common.config.converter.support.PagerConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jacks808@163.com on 16/9/15.
 */
@Configuration
public class ConvertConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new PagerConverter());
    }
}
