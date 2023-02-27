package com.cybersoft.demoJPA.dto;
//Chức năng và nhiệm vụ của DTO (data trasfer object) : Tránh vòng lặp vô vận và trả những data mình mong muốn
public class RoleDTO {
    private int id;
    private String name;
    private String desc;
    public RoleDTO(){

    }
    public RoleDTO(int id, String name, String desc){
        this.desc= desc;
        this.name=name;
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
