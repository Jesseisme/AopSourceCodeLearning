package cn.jessej.springaoplearning.service;


import cn.jessej.springaoplearning.model.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
