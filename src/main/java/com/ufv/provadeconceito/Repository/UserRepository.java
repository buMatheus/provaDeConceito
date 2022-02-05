package com.ufv.provadeconceito.Repository;

import com.ufv.provadeconceito.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT new com.ufv.provadeconceito.Entity.User(u.username, u.password) FROM User as u WHERE ((u.username = :username) AND (u.password = :password))")
    User getUser(@Param("username") String username, @Param("password") String password);

}