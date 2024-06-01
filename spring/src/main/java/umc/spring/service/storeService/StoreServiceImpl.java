package umc.spring.service.storeService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import umc.spring.apiPayload.code.status.ErrorStatus;
import umc.spring.apiPayload.exception.handler.RegionHandler;
import umc.spring.domain.Region;
import umc.spring.domain.Store;
import umc.spring.dto.storeDto.StoreRequestDTO;
import umc.spring.repository.RegionRepository;
import umc.spring.repository.StoreRepository;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {

    private final RegionRepository regionRepository;
    private final StoreRepository storeRepository;

    public Store addStore(Long regionId, @RequestBody @Valid StoreRequestDTO.AddRequestDTO addStoreDTO) {

        Region region = regionRepository.findById(regionId)
                .orElseThrow(() -> new RegionHandler(ErrorStatus.REGION_NOT_FOUND));

        Store store = Store.builder()
                .name(addStoreDTO.getName())
                .address(addStoreDTO.getAddress())
                .region(region)
                .build();

        return storeRepository.save(store);
    }
}
