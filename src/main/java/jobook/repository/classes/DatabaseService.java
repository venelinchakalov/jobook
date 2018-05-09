package jobook.repository.classes;
import jobook.repository.interfaces.Repository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class DatabaseService implements UserDetailsService {
    private final Repository database;

    public DatabaseService(Repository database) {
        this.database = database;
    }

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      jobook.models.interfaces.root_package.User user =  database.findByName(s);
        if(user!=null){

            List<GrantedAuthority> authorities =
                    new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new User(user.getMail(), user.getPassword(), authorities);
        }
        return null;
    }
}
