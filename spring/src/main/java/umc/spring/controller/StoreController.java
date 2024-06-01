package umc.spring.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.Store;
import umc.spring.dto.storeDto.StoreRequestDTO;
import umc.spring.dto.storeDto.StoreResponseDTO;
import umc.spring.service.storeService.StoreService;

@RestController
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @PostMapping("/regions/{regionId}/stores")
    public ApiResponse<StoreResponseDTO.AddResponseDTO> postStore(@PathVariable Long regionId, @RequestBody @Valid StoreRequestDTO.AddRequestDTO addRequestDTO) {
        Store store = storeService.addStore(regionId, addRequestDTO);
        return ApiResponse.onSuccess(StoreConverter.addResponseDTO(store));
    }
}
