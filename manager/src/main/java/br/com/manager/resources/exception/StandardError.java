package br.com.manager.resources.exception;


import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String errorMessage;
    private Long timeStamp;

    public StandardError(Integer status, String msg, Long timeStamp) {
        this.status = status;
        this.errorMessage = msg;
        this.timeStamp = timeStamp;
    }

    public StandardError() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
