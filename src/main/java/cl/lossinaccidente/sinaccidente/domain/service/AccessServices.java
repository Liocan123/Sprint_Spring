package cl.lossinaccidente.sinaccidente.domain.service;

import cl.lossinaccidente.sinaccidente.persistence.repository.iAcceso;
import cl.lossinaccidente.sinaccidente.web.model.Acceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessServices implements UserDetailsService {

    @Autowired
    private iAcceso repo;

    private final iAcceso repo2;

    public AccessServices(iAcceso repo, iAcceso repo2) {
        this.repo = repo;
        this.repo2 = repo2;
    }
/*
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Acceso acc = repo2.findByUser(username);



        UserDetails userDet = new User(acc.getUser(), acc.getPass(), roles);
        return userDet;
    } */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //return new User("[username]", "{noop}[password]", new ArrayList<>());
        Acceso acc = repo2.findByUser(username);
        System.out.println(acc);
        List<GrantedAuthority> roles = new ArrayList<>();
        //roles.add(new SimpleGrantedAuthority("ADMIN"));
        roles.add(new SimpleGrantedAuthority(acc.getRol()));

        return new org.springframework.security.core.userdetails.User(acc.getUser(), acc.getPass(), roles);
    }

}
