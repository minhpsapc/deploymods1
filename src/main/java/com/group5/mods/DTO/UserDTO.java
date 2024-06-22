package com.group5.mods.DTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotEmpty(message = "name cannot be empty")
    private String name;

    @NotEmpty(message = "username cannot be empty")
    private String username;

    @NotEmpty(message = "email cannot be empty")
    private String email;
    
    @NotEmpty(message = "password cannot be empty")
    private String password;
    
    private String roles;
}
