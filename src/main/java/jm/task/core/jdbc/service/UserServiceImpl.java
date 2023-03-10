package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoJDBS = new UserDaoJDBCImpl();
    public void createUsersTable() {
        userDaoJDBS.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBS.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBS.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoJDBS.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBS.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoJDBS.cleanUsersTable();
    }
}
