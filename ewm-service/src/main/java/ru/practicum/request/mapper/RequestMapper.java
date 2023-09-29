package ru.practicum.request.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.practicum.request.dto.ParticipationRequestDto;
import ru.practicum.request.model.Request;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RequestMapper {

    //ParticipationRequestDto toRequestDto(Request request);

    //List<ParticipationRequestDto> toRequestDto(List<Request> request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "event", source = "request.event.id")
    @Mapping(target = "created", source = "created")
    @Mapping(target = "requester", source = "request.requester.id")
    @Mapping(target = "status", source = "status")
    ParticipationRequestDto toParticipationRequestDto(Request request);


    Collection<ParticipationRequestDto> toParticipationRequestDtoCollection(
            Collection<Request> requests);

    List<ParticipationRequestDto> toParticipationRequestDtoList(
            List<Request> requests);

}

