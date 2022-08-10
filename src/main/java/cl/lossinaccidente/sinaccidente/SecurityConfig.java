package cl.lossinaccidente.sinaccidente;

import cl.lossinaccidente.sinaccidente.domain.service.AccessServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private AccessServices userDetailsService;

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService).passwordEncoder(bcrypt);

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/js/**", "/css/**").permitAll()
                .antMatchers("/login*").permitAll()
                .antMatchers("/").authenticated()
                .antMatchers("/contacto").hasRole("CLIENTE")
                .antMatchers("/ncapacitacion").hasRole("CLIENTE")
                .antMatchers("/capacitaciones").hasRole("CLIENTE")
                .antMatchers("/visitas/**").hasRole("PROFESIONAL")
                .antMatchers("/checkList").hasRole("PROFESIONAL")
                .antMatchers("/inicio").hasAnyRole("ADMIN", "USER", "CLIENTE","ADMINISTRATIVO", "PROFESIONAL")
                .antMatchers("/usuarios/**").hasRole("ADMINISTRATIVO")
                .antMatchers("/pagos/**").hasRole("ADMINISTRATIVO")
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/inicio", true)
                .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/denegado");

    }


}
