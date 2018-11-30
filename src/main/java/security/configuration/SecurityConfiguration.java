 package security.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
	
import controllers.LoginController;
	
@Configuration	
@EnableAutoConfiguration	
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
							
							
	public static final String SECURITY_LOGING = "/security/login";
	public static final String LOGIN = "/login";
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.antMatchers("/", "/index", "/css/**", "/javascript/**")
				.permitAll()
			.anyRequest().authenticated()
			.and()
				.formLogin()
		            .loginPage(LoginController.LOGIN)
		            .usernameParameter(LoginController.FORM_USERNAME)
		            .passwordParameter(LoginController.FORM_PASSWORD)
		            .permitAll()
		     .and()
		.httpBasic();
	}

}
