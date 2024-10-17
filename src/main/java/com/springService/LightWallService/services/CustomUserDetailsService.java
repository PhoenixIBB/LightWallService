package com.springService.LightWallService.services;

import com.springService.LightWallService.entities.UserEntity;
import com.springService.LightWallService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
        
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Пользователь не найден!"));
        return User.builder()
                .username(userEntity.getUsername())
                .password(passwordEncoder.encode((userEntity.getPassword())))
                .roles(userEntity.getRoles().split(","))
                .build();
    }
}
