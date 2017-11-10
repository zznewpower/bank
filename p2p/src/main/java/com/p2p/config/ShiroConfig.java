package com.p2p.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * Created by Administrator on 2017/11/7.
 */

/**
 * 商城的登录验证和授权
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(defaultWebSecurityManager);
        factoryBean.setLoginUrl("/");
        //设置用户没有该权限时默认访问该页面
        factoryBean.setUnauthorizedUrl("/noqx.html");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        //findAllCategory访问这个路径的时候需要在登录后验证该用户是否有订单管理的权限
        map.put("/findAllCategory","perms[订单管理]");
        map.put("/findUserTol","authc");
        map.put("/index.html","anon");
        map.put("/*.html","authc");
        factoryBean.setFilterChainDefinitionMap(map);
        return factoryBean;
    }

    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(JdbcRealm jdbcRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(jdbcRealm);
        return defaultWebSecurityManager;
    }
    @Bean
    public JdbcRealm jdbcRealm(DruidDataSource druidDataSource){
        JdbcRealm jdbcRealm = new JdbcRealm();
        jdbcRealm.setAuthenticationQuery("select password from users where account=?");
        jdbcRealm.setUserRolesQuery("select r.rolename from role r left join role_user ru on r.roleid=ru.role_id left join users u on u.userid=ru.user_id where u.account=?");
        jdbcRealm.setPermissionsQuery("select re.text from res re left join res_role rr on re.resid=rr.res_id left join role r on rr.role_id=r.roleid where r.rolename=?");
        jdbcRealm.setDataSource(druidDataSource);
        return jdbcRealm;
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
