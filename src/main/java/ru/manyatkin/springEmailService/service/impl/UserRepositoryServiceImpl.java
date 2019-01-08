package ru.manyatkin.springEmailService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.manyatkin.springEmailService.model.User;
import ru.manyatkin.springEmailService.repository.UserRepository;
import ru.manyatkin.springEmailService.service.UserRepositoryService;

import java.util.List;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll(int month, int day) {
        return userRepository.findByMatchMonthAndMathDay(month, day);
    }
}
