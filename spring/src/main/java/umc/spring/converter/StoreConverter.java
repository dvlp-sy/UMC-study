package umc.spring.converter;

import umc.spring.domain.Store;
import umc.spring.dto.storeDto.StoreResponseDTO;

public class StoreConverter {

    public static StoreResponseDTO.AddResponseDTO addResponseDTO(Store store) {
        return StoreResponseDTO.AddResponseDTO.builder()
                .regionId(store.getRegion().getId())
                .storeId(store.getId())
                .name(store.getName())
                .address(store.getAddress())
                .createdAt(store.getCreatedAt())
                .build();
    }
}
