package org.springscala.services

import java.lang.Iterable

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springscala.entity.Users
import org.springscala.repositories.UserRepository
import java.util.Optional

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

  def listUsers(): Iterable[Users] = {
    userRepository.findAll
  }

  def getUser(id: Long): Optional[Users] = {
    userRepository.findById(id)
  }

  def createUser(users: Users): Long = {
    userRepository.save(users)
    users.id
  }

}