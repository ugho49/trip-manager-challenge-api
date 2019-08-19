package fr.ustephan.tripmanager.presentation.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.Map;

/**
 * @author ugho_stephan.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

    private long timestamp = (new Date()).getTime();

    private int status;

    private String error;

    private String message;

    private Map<String, String> errorList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getErrorList() {
        return errorList;
    }

    public void setErrorList(Map<String, String> errorList) {
        this.errorList = errorList;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
