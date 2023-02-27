package com.cybersoft.demoJPA.service;

import com.cybersoft.demoJPA.dto.RoleDTO;
import com.cybersoft.demoJPA.entity.Roles;
import com.cybersoft.demoJPA.repository.RoleRepository;
import com.cybersoft.demoJPA.service.imp.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service  //Đưa lên bean:
public class RoleServiceImp implements RoleService {

    @Autowired //lấy trên bean xuống
    RoleRepository roleRepository;

    @Override
    public List<RoleDTO> getAllRole(){
        List<Roles> list = roleRepository.findAll();
        List<RoleDTO> dtoList = new ArrayList<>();
        for (Roles data:list) {
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(data.getId());
            roleDTO.setName(data.getName());
            roleDTO.setDesc(data.getDesc());

            dtoList.add(roleDTO);
        }
        return dtoList;
    }

    @Override
    public List<RoleDTO> getRoleByName(String name) {
        List<Roles> list = roleRepository.findByName(name);
        List<RoleDTO> dtoList = new ArrayList<>();
        for (Roles data:list) {
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(data.getId());
            roleDTO.setName(data.getName());
            roleDTO.setDesc(data.getDesc());

            dtoList.add(roleDTO);
        }
        return dtoList;
    }
}
