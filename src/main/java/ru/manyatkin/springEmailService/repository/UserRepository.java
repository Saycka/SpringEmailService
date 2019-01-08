package ru.manyatkin.springEmailService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.manyatkin.springEmailService.model.User;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByName(String name);

    List<User> findByBithDayAfter(LocalDate date);

    @Query(value = "SELECT u FROM User u WHERE u.name = ?1")
    List<User> findAllByName2(String name);

    @Query(value = "SELECT u FROM User u WHERE u.name = :name")
    List<User> findAllByName3(@Param("name") String name);

    @Query(value = "SELECT * FROM users WHERE name = :name", nativeQuery = true)
    List<User> findAllByName4(@Param("name") String name);

    @Query(value = "SELECT * FROM users WHERE " +
            "email IS NOT NULL " +
            "AND EXTRACT(MONTH FROM bithday) = :m " +
            "AND EXTRACT(DAY FROM bithday) = :d", nativeQuery = true)
    List<User> findByMatchMonthAndMathDay(@Param("m") int month, @Param("d") int day);
}
