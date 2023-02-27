package com.cybersoft.demoJPA.repository;

import com.cybersoft.demoJPA.dto.RoleDTO;
import com.cybersoft.demoJPA.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Tham số thứ nhất trong JpaRepository<Tên_Entity,Kiểu dũ liệu khoa chính (Dạng Object)>
//@Conponent, @Service, @Repository, @Bean thưởng được khai báo ở @Configuration
@org.springframework.stereotype.Repository
public interface RoleRepository extends JpaRepository<Roles,Integer> {
    List<Roles> findByName(String name);
}