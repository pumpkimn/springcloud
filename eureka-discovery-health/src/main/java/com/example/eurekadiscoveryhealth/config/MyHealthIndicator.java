package com.example.eurekadiscoveryhealth.config;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @description: 自定义健康检查配置
 * @author: lee
 * @create: 2019/03/09 13:20
 */
@Component
public class MyHealthIndicator implements HealthIndicator {
    private boolean up = true;

    @Override
    public Health health() {
        if (up){
            return new Health.Builder().withDetail("aaa_cnt",10)//自定义检查内容
                                        .withDetail("bbb_status","up").up().build();
        }else {
            return new Health.Builder().withDetail("error","client is down ").down().build();
        }
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }
}
