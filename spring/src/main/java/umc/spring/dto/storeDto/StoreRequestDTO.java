package umc.spring.dto.storeDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public class StoreRequestDTO {

    @Getter
    public static class AddRequestDTO {

        @NotNull
        private String name;

        @Size(min = 2, max = 50)
        private String address;
    }
}
