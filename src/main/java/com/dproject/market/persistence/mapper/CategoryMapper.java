package com.dproject.market.persistence.mapper;

import com.dproject.market.domain.CategoryDomain;
import com.dproject.market.persistence.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategory", target = "idCategory"),
            @Mapping(source = "descriptionCategory", target = "description"),
            @Mapping(source = "statusCategory", target = "active")
    })
    CategoryDomain toCategory(CategoryEntity categoryEntity);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    CategoryEntity toCategory(CategoryDomain categoryDomain);
}
