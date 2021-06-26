package com.epam.feature.toggle.service;

import com.epam.feature.toggle.data.FeatureToggle;
import com.epam.feature.toggle.repository.FeatureToggleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FeatureToggleServiceImpl implements FeatureToggleService {

    private final FeatureToggleRepository repository;

    @Override
    public List<FeatureToggle> getToggles() {
        final List<FeatureToggle> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public FeatureToggle getToggle(final String code) {
        return repository.findByCode(code);
    }

    @Override
    public FeatureToggle updateToggle(final FeatureToggle toggle) {
        final FeatureToggle byCode = repository.findByCode(toggle.getCode());
        byCode.setEnabled(toggle.isEnabled());
        return repository.save(byCode);
    }

    @Override
    public void createToggle(final FeatureToggle toggle) {
        repository.save(toggle);
    }

    @Override
    public void deleteToggle(final FeatureToggle toggle) {
        repository.delete(toggle);
    }
}
