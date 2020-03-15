package com.songhaozhi.mayday.config;

import com.github.diamond.client.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Properties;

/**
 *
 * @ClassName: SuperdiamondConfig
 * @Description: SuperdiamondConfig
 * @Author: zjzhao2@iflytek.com
 * @Date: 2020-03-08 19:56
 **/
@Configuration
public class SuperdiamondConfig {


    private static final String SUPERDIAMOND_HOST = "superdiamond.host";
    private static final Integer PORT = 8283;
    private static final String PROJ_CODE = "my-blog";
    private static final String PROFILE = "production";
    private static final String DEV = "development";

    /**
     * 开发环境 Superdiamond 配置
     */
    @Bean("superdiamondPropertiesConfiguration")
    public PropertiesConfiguration devPropertiesConfiguration() {
        return new PropertiesConfiguration(SUPERDIAMOND_HOST, PORT, PROJ_CODE, DEV);
    }

    @Bean("superdiamondProperties")
    public Properties superdiamondProperties(PropertiesConfiguration propertiesConfiguration) {
        return propertiesConfiguration.getProperties();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(@Qualifier(
            "superdiamondProperties") Properties properties) {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setProperties(properties);
        return propertySourcesPlaceholderConfigurer;
    }
}
