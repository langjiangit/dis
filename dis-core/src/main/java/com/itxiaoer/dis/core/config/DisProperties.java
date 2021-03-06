package com.itxiaoer.dis.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * dis properties
 *
 * @author : liuyk
 */
@Data
@ConfigurationProperties(prefix = "spring.dis")
public class DisProperties {
    /**
     * active
     */
    private boolean active;
    /**
     * appId
     */
    private String appId;
}
