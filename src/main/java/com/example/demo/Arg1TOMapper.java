package com.example.demo;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Map;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface Arg1TOMapper {

    @Mapping(target = "arg1", ignore = true)
    DestinationTO mapSource(SourceTO source,
                            Map<String, List<String>> arg1);

}
