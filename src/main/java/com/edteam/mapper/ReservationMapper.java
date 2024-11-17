package com.edteam.mapper;

import org.springframework.core.convert.converter.Converter;
import com.edteam.dto.ReservationDTO;
import com.edteam.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper extends Converter<Reservation, ReservationDTO> {

    @Override
    public ReservationDTO convert(Reservation source);
}
