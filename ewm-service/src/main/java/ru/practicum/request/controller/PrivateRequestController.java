package ru.practicum.request.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.request.dto.ParticipationRequestDto;
import ru.practicum.request.mapper.RequestMapper;
import ru.practicum.request.service.RequestService;

import javax.validation.constraints.Min;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/{userId}/requests")
@Slf4j
@Validated
public class PrivateRequestController {

    private final RequestService requestService;

    private final RequestMapper requestMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ParticipationRequestDto addRequest(@PathVariable(name = "userId") Long userId, @RequestParam(name = "eventId") Long eventId) {

        return requestMapper.toParticipationRequestDto(requestService.createRequest(userId, eventId));
    }

    @PatchMapping("{requestId}/cancel")
    public ParticipationRequestDto cancelRequest(@PathVariable @Min(0) Long userId,
                                                 @PathVariable @Min(0) Long requestId) {

        return requestMapper.toParticipationRequestDto(requestService.cancelRequest(userId, requestId));
    }

    @GetMapping
    public Collection<ParticipationRequestDto> getUserRequests(@PathVariable @Min(0) Long userId) {

        return requestMapper.toParticipationRequestDtoCollection(requestService.getUserRequests(userId));
    }

}
