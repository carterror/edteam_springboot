package com.edteam.mapper;

import org.springframework.core.convert.converter.Converter;
import com.edteam.dto.ReservationDTO;
import com.edteam.model.Reservation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationsMapper extends Converter<List<Reservation>, List<ReservationDTO>> {

    @Override
    public List<ReservationDTO> convert(List<Reservation> source);
}
