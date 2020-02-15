package cn.itcast.day01.Pojo;

import java.io.Serializable;

public class ResultInfo implements Serializable {
    private static final Long Serializable = 1L;


    private Boolean success;
    private Object  data;
    private String error;


    public ResultInfo(Boolean success, Object data, String error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
