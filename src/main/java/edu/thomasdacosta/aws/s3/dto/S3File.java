package edu.thomasdacosta.aws.s3.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class S3File {

    private String fileName;
    private String content;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static S3File getInstance(String fileName, String content) {
        S3File s3File = new S3File();
        s3File.setFileName(fileName);
        s3File.setContent(content);
        return s3File;
    }

}
