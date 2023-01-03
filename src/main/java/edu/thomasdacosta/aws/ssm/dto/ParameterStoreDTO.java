package edu.thomasdacosta.aws.ssm.dto;

import org.springframework.beans.factory.annotation.Value;

public class ParameterStoreDTO {

    private String notificationName;
    private String queueName;
    private String directory;
    private String proxyHost;
    private String proxyPort;
    private String proxyEnabled;

    public String getNotificationName() {
        return notificationName;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public String getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyEnabled() {
        return proxyEnabled;
    }

    public void setProxyEnabled(String proxyEnabled) {
        this.proxyEnabled = proxyEnabled;
    }

}
