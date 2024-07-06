package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleDao {
    Role findByName(String name);

    List<Role> findAll();

    Role findById(Long id);

    void save(Role role);
}
