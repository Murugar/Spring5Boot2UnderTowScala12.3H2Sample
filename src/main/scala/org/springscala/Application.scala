package org.springscala

import javax.annotation.PostConstruct

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springscala.entity.Users
import org.springscala.repositories.UserRepository

@SpringBootApplication
class Application(@Autowired private val userRepository: UserRepository){



}
object Application extends App {
  SpringApplication.run(classOf[Application])
}
