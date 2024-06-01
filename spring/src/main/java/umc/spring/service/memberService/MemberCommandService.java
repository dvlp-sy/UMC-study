package umc.spring.service.memberService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import umc.spring.domain.Member;
import umc.spring.dto.MemberRequestDTO;

public interface MemberCommandService {

    public Member join(@RequestBody @Valid MemberRequestDTO.JoinDto request);
}
