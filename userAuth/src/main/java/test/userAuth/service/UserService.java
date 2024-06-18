package test.userAuth.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.userAuth.model.User;
import test.userAuth.repository.UserRepository;



@Service
public class UserService {

   
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) throws Exception {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new Exception("Mail already registered");
        }
        return userRepository.save(user);
    }
    
        public User fetchUser(String email, String password) {
            return userRepository.findByEmailAndPassword(email, password);
        }
    
    
}
