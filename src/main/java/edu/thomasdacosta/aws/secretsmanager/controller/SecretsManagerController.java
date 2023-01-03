package edu.thomasdacosta.aws.secretsmanager.controller;

import edu.thomasdacosta.aws.secretsmanager.configuration.SecretsManagerConfiguration;
import edu.thomasdacosta.aws.secretsmanager.dto.SecretsManagerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class SecretsManagerController {

    @Autowired
    private SecretsManagerConfiguration secretsManagerConfiguration;

    @GetMapping("/secretsManager")
    public ResponseEntity<SecretsManagerDTO> configuration() {
        SecretsManagerDTO secretsManager = new SecretsManagerDTO();
        secretsManager.setHash(secretsManagerConfiguration.getHash());
        secretsManager.setTs(secretsManagerConfiguration.getTs());
        secretsManager.setApiKey(secretsManagerConfiguration.getApiKey());
        return new ResponseEntity<>(secretsManager, HttpStatus.OK);
    }

}
