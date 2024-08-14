package ryan_deisler.profile_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ryan_deisler.profile_backend.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
