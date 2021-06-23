package com.epam.feature.toggle.service;

import com.epam.feature.toggle.data.FeatureToggle;

import java.util.List;

public interface FeatureToggleService {
    List<FeatureToggle> getToggles();

    FeatureToggle getToggle(String code);

    FeatureToggle updateToggle(FeatureToggle toggle);

    void createToggle(FeatureToggle toggle);

    void deleteToggle(FeatureToggle toggle);
}
