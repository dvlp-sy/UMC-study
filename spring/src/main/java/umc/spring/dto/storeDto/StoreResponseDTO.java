package umc.spring.dto.storeDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

public class StoreResponseDTO {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddResponseDTO {
        private Long regionId;
        private Long storeId;
        private String name;
        private String address;
        private LocalDateTime createdAt;
    }
}
