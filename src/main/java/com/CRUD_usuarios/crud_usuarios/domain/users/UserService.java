package com.CRUD_usuarios.crud_usuarios.domain.users;

import com.CRUD_usuarios.crud_usuarios.entities.User;
import com.CRUD_usuarios.crud_usuarios.domain.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Criar novo usuário
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Listar todos os usuários
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Buscar usuário por ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Atualizar usuário
    public Optional<User> updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return Optional.of(userRepository.save(user));
        }
        return Optional.empty();
    }

    // Deletar usuário
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
