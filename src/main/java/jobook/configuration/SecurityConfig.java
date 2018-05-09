package jobook.configuration;


import jobook.repository.classes.DatabaseService;
import jobook.repository.interfaces.Repository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.beans.factory.annotation.*;
@Configuration
@EnableWebSecurity
@ComponentScan("jobook")

public class SecurityConfig extends WebSecurityConfigurerAdapter{
   @Autowired
    private Repository repository;



    @Override

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.
                userDetailsService(new DatabaseService(repository));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .antMatchers("/" , "/resources/**" , "/login" , "/register/**" , "/talentmarket").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login")
                .and()
                .csrf().disable();
    }
}
