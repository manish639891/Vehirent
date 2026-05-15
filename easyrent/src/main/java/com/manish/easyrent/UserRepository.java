package com.manish.easyrent;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Email ke zariye user check karne ke liye
    Optional<User> findByEmail(String email);
}