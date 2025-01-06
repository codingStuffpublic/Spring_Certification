package com.spring.professional.exam.tutorial.module01.question33.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelExpressions {

    @Value("#{T(com....beans.SpringBean2).staticMethod()}")
    private String staticMethodExecutionResult;

    @Value("#{T(com....beans.SpringBean2).STATIC_VALUE}")
    private String staticValueFetchResult;

    @Value("#{@springBean2.property}")
    private String propertyValue;

    @Value("#{@springBean2.method()}")
    private String methodValue;

    @Value("#{environment['app.file.property']}")
    private String appFileProperty;

    @Value("#{systemProperties['app.vm.property']}")
    private String appVmProperty;

    @Value("#{systemEnvironment['JAVA_HOME']}")
    private String javaHome;

    
}


