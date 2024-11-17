package com.edteam.mapper;

import org.springframework.core.convert.converter.Converter;
import com.edteam.dto.ReservationDTO;
import com.edteam.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationDTOMapper extends Converter<ReservationDTO, Reservation> {

    @Override
    public Reservation convert(ReservationDTO source);
}
