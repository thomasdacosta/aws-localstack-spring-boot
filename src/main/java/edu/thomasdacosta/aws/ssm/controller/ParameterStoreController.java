package edu.thomasdacosta.aws.ssm.controller;

import edu.thomasdacosta.aws.ssm.configuration.ParameterStoreConfiguration;
import edu.thomasdacosta.aws.ssm.dto.ParameterStoreDTO;
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
public class ParameterStoreController {

    @Autowired
    private ParameterStoreConfiguration parameterStoreConfiguration;

    @GetMapping("/parameterStore")
    public ResponseEntity<ParameterStoreDTO> configuration() {
        ParameterStoreDTO parameterStoreDTO = new ParameterStoreDTO();
        parameterStoreDTO.setNotificationName(parameterStoreConfiguration.getNotificationName());
        parameterStoreDTO.setQueueName(parameterStoreConfiguration.getQueueName());
        parameterStoreDTO.setDirectory(parameterStoreConfiguration.getDirectory());
        parameterStoreDTO.setProxyHost(parameterStoreConfiguration.getProxyHost());
        parameterStoreDTO.setProxyPort(parameterStoreConfiguration.getProxyPort());
        parameterStoreDTO.setProxyEnabled(parameterStoreConfiguration.getProxyEnabled());
        return new ResponseEntity<>(parameterStoreDTO, HttpStatus.OK);
    }

}
