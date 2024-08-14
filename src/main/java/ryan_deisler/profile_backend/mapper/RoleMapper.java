package ryan_deisler.profile_backend.mapper;

import ryan_deisler.profile_backend.dto.RoleDto;
import ryan_deisler.profile_backend.entity.Role;

public class RoleMapper {
    public static RoleDto mapToRoleDto(Role role) {
        return new RoleDto(
                role.getId(),
                role.getTitle(),
                role.getSummary(),
                role.getStartDate(),
                role.getEndDate(),
                role.getCompany());
    }

    public static Role mapToRole(RoleDto roleDto) {
        return new Role(
                roleDto.getId(),
                roleDto.getTitle(),
                roleDto.getSummary(),
                roleDto.getStartDate(),
                roleDto.getEndDate(),
                roleDto.getCompany());
    }
}
