package com.qihang.objectiondetectioncomputer.Confituration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author qihang
 * @create 2022-09-18 下午  06:22
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "pythonconfig")
public class PythonConf {
    private String anacondaExecutor;
    private String scriptPath;
}
