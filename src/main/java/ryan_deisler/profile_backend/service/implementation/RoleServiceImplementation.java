package ryan_deisler.profile_backend.service.implementation;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ryan_deisler.profile_backend.service.RoleService;
import ryan_deisler.profile_backend.dto.RoleDto;
import ryan_deisler.profile_backend.entity.Role;
import ryan_deisler.profile_backend.mapper.RoleMapper;
import ryan_deisler.profile_backend.repository.RoleRepository;

@Service
@AllArgsConstructor
public class RoleServiceImplementation implements RoleService {
    private RoleRepository roleRepository;

    @Override
    public RoleDto createRole(RoleDto roleDto) {

        Role role = RoleMapper.mapToRole(roleDto);
        Role savedRole = roleRepository.save(role);

        return RoleMapper.mapToRoleDto(savedRole);
    }
}
