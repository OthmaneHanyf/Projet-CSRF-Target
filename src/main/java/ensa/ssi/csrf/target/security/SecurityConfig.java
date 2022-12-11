package ensa.ssi.csrf.target.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

@Configurable
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("{noop}1234").roles("USER");
//        auth.inMemoryAuthentication()
//                .withUser("admin").password("{noop}1234").roles("ADMIN", "USER");
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username as principal, password as credentials, active FROM users WHERE username=?")
                .authoritiesByUsernameQuery("select username as principal, name as role FROM users INNER JOIN user_roles ON users.id=user_roles.user_id INNER JOIN roles ON roles.id=user_roles.role_id WHERE username=?")
                .rolePrefix("ROLE_");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login");
        http.logout();
        http.csrf().disable();
        http.authorizeRequests().antMatchers( "/clients").hasRole("ADMIN");
        http.authorizeRequests().antMatchers("/operations", "/comptes/**").hasAnyRole("USER", "ADMIN");
    }
}
