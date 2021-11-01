package com.example.lkproje.HelloWorld.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAOService {
    private static List<User> users = new ArrayList<>();
    private static int users_cont = 3;
    static {
        users.add(new User(1,"BİLAL",new Date()));
        users.add(new User(2,"ENEZ",new Date()));
        users.add(new User(3,"EMRE",new Date()));

    }
public List<User> findAll() {
        return users;
}
public User Save(User user) {
        if (user.getID() == null) {
            user.setID(++users_cont );
        }
        users.add(user);
        return user;

}
public User silme(int ID) {
    Iterator<User> userIterator = users.iterator();
    while (userIterator.hasNext()) {
        User user = userIterator.next();
        if(user.getID() == ID) {
            userIterator.remove();
            return user;
        }
        return null;
    }
    return null;
}


}
