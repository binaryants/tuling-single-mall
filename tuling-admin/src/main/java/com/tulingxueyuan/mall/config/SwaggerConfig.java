package com.tulingxueyuan.mall.config;

import com.tulingxueyuan.mall.common.config.BaseSwaggerConfig;
import com.tulingxueyuan.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.tulingxueyuan.mall.modules")
                .title("东黄山项目后台管理系统")
                .description("接口文档")
                .contactName("Bin")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
