package ru.manyatkin.springEmailService.service;

import ru.manyatkin.springEmailService.model.User;

import java.util.List;

public interface UserRepositoryService {
    List<User> getAll (int month, int day);
}
