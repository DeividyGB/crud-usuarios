package com.CRUD_usuarios.crud_usuarios.domain.users;

import com.CRUD_usuarios.crud_usuarios.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository já fornece métodos como save, findById, deleteById, etc.
}
