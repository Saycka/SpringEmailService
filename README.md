# SpringEmailService

https://habr.com/post/352954/

Сервисы, расписания, БД

1. PosgreSQL — в качестве базы данных 
2. JPA — доступ к базе 
3. Lombok — для удобства и избавления от бойлерплейт кода(не придётся писать геттеры, сеттеры и тд самим), подробнее тут
4. Mail — собственно для работы и отправки email-ов



Could not autowire. No beans of 'JavaMailSender' type found

решение в application.properties

#Настройки email-a
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
