package com.gl.employeesvc.EmployeesSvc.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeesvc.EmployeesSvc.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
