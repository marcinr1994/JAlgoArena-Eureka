package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
@Configuration
@EnableSwagger2
open class JAlgoArenaEurekaServer {

    @Bean
    open fun jalGoArenaApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.jalgoarena"))
                .paths(PathSelectors.any()).build()
    }
}
fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaEurekaServer::class.java, *args)
}
