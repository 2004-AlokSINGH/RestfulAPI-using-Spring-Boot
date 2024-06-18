package test.userAuth.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import test.userAuth.model.User;



public interface UserRepository extends JpaRepository<User, String> {
// getting by email and password
	 User findByEmailAndPassword(String email, String password);
//    checking email
    User findByEmail(String email);
    
}
