package lv.intrade.cp.init;

import lv.intrade.cp.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 13.24.10
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private DataSource dataSource;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    protected void registerAuthentication(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    protected void configure(HttpSecurity http) throws Exception{
        http.userDetailsService(customUserDetailsService)
                .authorizeRequests()
                .antMatchers("/manage/**").hasRole("CUSTOMER")
                .antMatchers("/admin/**").hasRole("MANAGER")
                .and()
                .formLogin()
                .loginPage("/login.jsp")
                .defaultSuccessUrl("/index.jsp")
                .failureUrl("/login.jsp?auth-error=1")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/login.jsp?logout=1");
    }
}
