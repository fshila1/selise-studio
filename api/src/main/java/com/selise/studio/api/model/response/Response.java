package com.selise.studio.api.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    int responseCode;
    String responseStatus;
    T dataObj;
    List<T> dataList;

    public Response(int code, String status, T obj, List<T> list) {
        this.responseCode = code;
        this.responseStatus = status;
        this.dataObj = obj;
        this.dataList = list;
    }

    public int getResponseCode() { return responseCode; }
    public String getResponseStatus() { return responseStatus; }
    public T getDataObj() { return dataObj; }
    public List<T> getDataList() { return dataList; }

    public void setResponseCode(int code) { this.responseCode = code; }
    public void setResponseStatus(String status) { this.responseStatus = status; }
    public void setDataObj(T obj) { this.dataObj = obj; }
    public void setDataList(List<T> list) { this.dataList = list; }
}
