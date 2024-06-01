package umc.spring.service.storeService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import umc.spring.domain.Store;
import umc.spring.dto.storeDto.StoreRequestDTO;

public interface StoreService {
    public Store addStore(Long regionId, @RequestBody @Valid StoreRequestDTO.AddRequestDTO addStoreDTO);
}
