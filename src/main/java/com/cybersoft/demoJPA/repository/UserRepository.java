package com.cybersoft.demoJPA.repository;

import com.cybersoft.demoJPA.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    List<Users> findByEmailAndPassword(String email, String password);
    @Query("select  u from users as u ")
//    public  List<Map<String,Object>>;
     List<Users> getAllUser();
    @Query(value = "select u from  users u join roles r on u.roles.id=r.id " +
            "where u.email=?1 and r.name=?2", nativeQuery = true)
     List<Users> getUserByEmailAndRoleName(String email, String roleName);
}
