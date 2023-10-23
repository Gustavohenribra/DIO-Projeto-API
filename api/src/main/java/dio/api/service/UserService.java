package dio.api.service;

import java.util.List;

import dio.api.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
    User update(Long id, User user);
    void delete(Long id);
    boolean existsById(Long id);
    List<User> getAllUsers();
}

