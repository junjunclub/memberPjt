package security.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.spring.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
