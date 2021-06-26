package com.epam.feature.toggle.repository;

import com.epam.feature.toggle.data.FeatureToggle;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface FeatureToggleRepository extends CrudRepository<FeatureToggle, String> {
    FeatureToggle findByCode(String code);
}
