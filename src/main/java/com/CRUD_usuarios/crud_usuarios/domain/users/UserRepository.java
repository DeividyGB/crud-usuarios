package com.CRUD_usuarios.crud_usuarios.domain.users;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CRUD_usuarios.crud_usuarios.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
