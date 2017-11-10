package com.p2p.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/10/23.
 */
@Configuration
@EnableCaching
public class RedisConfig {
    /*@Bean
    public KeyGenerator mykey(){

        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                String name = o.getClass().getName();
                String methodName = method.getName();
                return name+methodName;
            }
        };
    }

    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public CacheManager cacheManager(RedisTemplate<String,Object> template){
        RedisCacheManager manager = new RedisCacheManager(template);
        return manager;
    }*/
}
