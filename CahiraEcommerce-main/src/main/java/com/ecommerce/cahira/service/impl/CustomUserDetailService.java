package com.ecommerce.cahira.service.impl;

import com.ecommerce.cahira.entity.CustomUserDetail;
import com.ecommerce.cahira.entity.User;
import com.ecommerce.cahira.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomUserDetailService implements UserDetailsService {
@Autowired
UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmail(email);
        user.orElseThrow(()->new UsernameNotFoundException("User not Found"));
        return user.map(CustomUserDetail::new).get();
    }
}
