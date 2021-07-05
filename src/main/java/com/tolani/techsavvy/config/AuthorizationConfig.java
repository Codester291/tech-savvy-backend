//package com.tolani.techsavvy.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.www.DigestAuthenticationEntryPoint;
//import org.springframework.security.web.authentication.www.DigestAuthenticationFilter;
//
//@Configuration
//public class AuthorizationConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.antMatcher("/translate/admin/**")
//                .addFilter(digestAuthenticationFilter()).exceptionHandling()
//                .authenticationEntryPoint(digestAuthenticationEntryPoint())
//                .and().authorizeRequests()
//                .antMatchers("/api/v1/tech-savvy/admin/**").hasRole("ADMIN")
//                .and().authorizeRequests()
//                .antMatchers("/api/v1/tech-savvy/user/**").hasRole("USER");
//    }
//
//    public DigestAuthenticationFilter digestAuthenticationFilter () {
//        var digestAuthenticationFilter = new DigestAuthenticationFilter();
//        digestAuthenticationFilter.setUserDetailsService(userDetailsService());
//        digestAuthenticationFilter.setAuthenticationEntryPoint(digestAuthenticationEntryPoint());
//        digestAuthenticationFilter.setCreateAuthenticatedToken(true);
//        return digestAuthenticationFilter;
//    }
//
//    private DigestAuthenticationEntryPoint digestAuthenticationEntryPoint () {
//        var digestAuthenticationEntryPoint = new DigestAuthenticationEntryPoint();
//        digestAuthenticationEntryPoint.setRealmName("admin-digest-realm");
//        digestAuthenticationEntryPoint.setKey("1236");
//        return digestAuthenticationEntryPoint;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("1234")
//                .roles("USER");
//
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("12345")
//                .roles("ADMIN");
//    }
//
//    @Override
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return super.userDetailsService();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder () {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
