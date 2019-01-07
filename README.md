# SpringEmailService

https://habr.com/post/352954/

Сервисы, расписания, БД

1. PosgreSQL — в качестве базы данных 
2. JPA — доступ к базе 
3. Lombok — для удобства и избавления от бойлерплейт кода(не придётся писать геттеры, сеттеры и тд самим), подробнее тут
4. Mail — собственно для работы и отправки email-ов



Could not autowire. No beans of 'JavaMailSender' type found

I had this same issue when creating a Spring Boot application using their @SpringBootApplication annotation. This annotation represents @Configuration, @EnableAutoConfiguration and @ComponentScan according to the spring reference.

As expected, the new annotation worked properly and my application ran smoothly but, Intellij kept complaining about unfulfilled @Autowire dependencies. As soon as I changed back to using @Configuration, @EnableAutoConfiguration and @ComponentScan separately, the errors ceased. It seems Intellij 14.0.3 (and most likely, earlier versions too) is not yet configured to recognise the @SpringBootApplication annotation.

For now, if the errors disturb you that much, then revert back to those three separate annotations. Otherwise, ignore Intellij...your dependency resolution is correctly configured, since your test passes.
