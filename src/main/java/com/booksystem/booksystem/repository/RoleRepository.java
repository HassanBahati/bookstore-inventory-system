package com.booksystem.booksystem.repository;

import com.booksystem.booksystem.model.Role;
import com.booksystem.booksystem.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}