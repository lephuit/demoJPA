package com.cybersoft.demoJPA.service.imp;

import com.cybersoft.demoJPA.dto.RoleDTO;

import java.util.List;

//obfucate: Làm mờ code:

public interface RoleService {
    List<RoleDTO> getAllRole();
    List<RoleDTO> getRoleByName(String name);
}
