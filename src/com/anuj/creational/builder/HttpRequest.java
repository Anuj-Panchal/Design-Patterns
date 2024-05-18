package com.anuj.creational.builder;

import com.anuj.creational.builder.builder.IHttpRequestBuilder;

import java.util.Map;

public class HttpRequest implements IHttpRequest{
    private Map<String, String> params;

    private Map<String, String> headers;

    private String payload;

    public Map<String, String> getParams() {
        return params;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getPayload() {
        return payload;
    }

    public HttpRequest(IHttpRequestBuilder httpRequestBuilder) {
        this.params = httpRequestBuilder.getParams();
        this.headers = httpRequestBuilder.getHeaders();
        this.payload = httpRequestBuilder.getPayload();
    }

    @Override
    public void sendRequest() {
        System.out.println("Sending request with " + this);
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "params=" + params +
                ", headers=" + headers +
                ", requestBody='" + payload + '\'' +
                '}';
    }
}
