package ryan_deisler.profile_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private Long id;
    private String title;
    private String[] summary;
    private String startDate;
    private String endDate;
    private String company;
}
