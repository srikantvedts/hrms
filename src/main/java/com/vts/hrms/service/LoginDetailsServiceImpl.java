package com.vts.hrms.service;

import com.vts.hrms.entity.Login;
import com.vts.hrms.repository.LoginRepository;
import com.vts.hrms.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;
@Service
public class LoginDetailsServiceImpl implements UserDetailsService{


    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional(readOnly = false)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Login login = loginRepository.findByUsernameAndIsActive(username,1);

        if(login != null && login.getIsActive()==1) {
            Set<GrantedAuthority> grantedAuthorities=login.getRoleSecurity().stream().
                    map(roleSecurity -> new SimpleGrantedAuthority(roleSecurity.getRoleName())).collect(Collectors.toSet());

            return new org.springframework.security.core.userdetails.User(login.getUsername(), login.getPassword(), grantedAuthorities);
        }
        else {
            throw new UsernameNotFoundException("Username not found");
        }
    }
}
