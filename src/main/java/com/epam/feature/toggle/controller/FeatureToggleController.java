package com.epam.feature.toggle.controller;

import com.epam.feature.toggle.data.FeatureToggle;
import com.epam.feature.toggle.service.FeatureToggleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feature-toggle/v1")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FeatureToggleController {

    private final FeatureToggleService featureToggleService;

    @GetMapping
    public List<FeatureToggle> getToggles() {
        return featureToggleService.getToggles();
    }

    @GetMapping("/{code}")
    public FeatureToggle getToggle(@PathVariable final String code) {
        return featureToggleService.getToggle(code);
    }

    @PutMapping("/{code}")
    public FeatureToggle updateToggle(@PathVariable final String code, @RequestBody final FeatureToggle toggle) {
        toggle.setCode(code);
        return featureToggleService.updateToggle(toggle);
    }

    @PostMapping("/{code}")
    public void createToggle(@PathVariable final String code, @RequestBody final FeatureToggle toggle) {
        toggle.setCode(code);
        featureToggleService.createToggle(toggle);
    }

    @DeleteMapping("/{code}")
    public void deleteToggle(@PathVariable final String code) {
        featureToggleService.deleteToggle(FeatureToggle.builder().code(code).build());
    }
}
