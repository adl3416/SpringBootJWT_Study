package com.techproed.SpringBootJWT_Study;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class MyUserDetailsService implements UserDetailsService {
    //  JWT icin  MyUserDetailsService claass mutlaka create edilmeli.
    //  Cunku loadUserByUsername ile App`e user upload edilmelidir


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("admin","nimda",new ArrayList<>());
    }
}
