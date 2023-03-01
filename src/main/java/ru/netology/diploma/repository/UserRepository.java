package ru.netology.diploma.repository;

import ru.netology.diploma.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer> {
    Optional<User> findUserByLogin(String login);

}
