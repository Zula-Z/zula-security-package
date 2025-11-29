package com.zula.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zula.security")
public class SecurityProperties {
    private boolean enabled = true;
    private String jwtSecret = "zula-secret-key";
    private long jwtExpiration = 86400000;
    private String issuer = "zula-platform";

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public String getJwtSecret() { return jwtSecret; }
    public void setJwtSecret(String jwtSecret) { this.jwtSecret = jwtSecret; }

    public long getJwtExpiration() { return jwtExpiration; }
    public void setJwtExpiration(long jwtExpiration) { this.jwtExpiration = jwtExpiration; }

    public String getIssuer() { return issuer; }
    public void setIssuer(String issuer) { this.issuer = issuer; }
}