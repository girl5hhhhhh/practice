package com.example.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @description: Swagger配置
 * @author: chunyan.li
 * @time: 2023/6/17 17:59
 */
@Configuration
@EnableSwagger2 //开启Swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }

    @Bean
    public Docket docket(Environment environment){
        Profiles profiles = Profiles.of("dev","test");
        boolean flag = environment.acceptsProfiles(profiles);
        System.out.println(flag);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(flag)
                .groupName("lcy")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.practice.conroller"))
                .build();
    }

    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("lcy", "https://www.cnblogs.com/ziyanxiao/", "***");
        return new ApiInfo(
                "lcy的SwaggerAPI文档",
                "破茧成蝶",
                "v1.0",
                "https://www.cnblogs.com/ziyanxiao/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>());
    }
}
