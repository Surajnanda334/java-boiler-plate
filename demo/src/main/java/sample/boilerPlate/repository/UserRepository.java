package sample.boilerPlate.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sample.boilerPlate.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
