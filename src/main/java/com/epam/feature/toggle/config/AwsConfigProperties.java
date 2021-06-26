package com.epam.feature.toggle.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "amazon.aws")
@Data
@NoArgsConstructor
public class AwsConfigProperties {
    private String accessKey;
    private String secretKey;
    private String dynamodbEndpoint;
}
