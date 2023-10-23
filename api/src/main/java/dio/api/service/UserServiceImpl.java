package dio.api.service;

import dio.api.model.User;
import dio.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public User update(Long id, User user) {
        if (!userRepository.existsById(id)) {
            return null;
        }
        user.setId(id);
        return userRepository.save(user);
    }
    
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    
    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
