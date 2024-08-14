package ryan_deisler.profile_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.AllArgsConstructor;
import ryan_deisler.profile_backend.dto.RoleDto;
import ryan_deisler.profile_backend.service.RoleService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private RoleService roleService;

    // Build Add Role REST API
    @PostMapping
    public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto roleDto) {
        RoleDto savedRole = roleService.createRole(roleDto);
        return new ResponseEntity<>(savedRole, HttpStatus.CREATED);
    }
}
