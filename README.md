# SpringEmailService

https://habr.com/post/352954/

Сервисы, расписания, БД

1. PosgreSQL — в качестве базы данных 
2. JPA — доступ к базе 
3. Lombok — для удобства и избавления от бойлерплейт кода(не придётся писать геттеры, сеттеры и тд самим), подробнее тут
4. Mail — собственно для работы и отправки email-ов



Could not autowire. No beans of 'JavaMailSender' type found

решение @EnableAutoConfiguration
