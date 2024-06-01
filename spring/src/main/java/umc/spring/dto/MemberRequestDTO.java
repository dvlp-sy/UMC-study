package umc.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import umc.spring.validator.annotation.ExistCategories;

import java.util.List;

public class MemberRequestDTO {

    @Getter
    public static class JoinDto {

        @NotBlank
        String name;

        @NotNull
        Integer gender;

        @Size(min = 2, max = 50)
        String address;

        @Size(min = 2, max = 50)
        String specAddress;

        @ExistCategories
        List<Long> preferCategory;
    }
}
