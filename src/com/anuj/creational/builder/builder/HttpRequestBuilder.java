package com.anuj.creational.builder.builder;

import com.anuj.creational.builder.HttpRequest;
import com.anuj.creational.builder.IHttpRequest;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder implements IHttpRequestBuilder {

    private Map<String, String> params;

    private Map<String, String> headers;

    private String payload;

    public HttpRequestBuilder() {
        this.params = new HashMap<>();
        this.headers = new HashMap<>();
        this.payload = "";
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    public String getPayload() {
        return payload;
    }

    @Override
    public IHttpRequestBuilder addParam(String key, String value) {
        params.put(key, value);
        return this;
    }

    @Override
    public IHttpRequestBuilder addParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    @Override
    public IHttpRequestBuilder addHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    @Override
    public IHttpRequestBuilder addHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    @Override
    public IHttpRequestBuilder addPayload(String payload) {
        this.payload = payload;
        return this;
    }

    @Override
    public IHttpRequest build() {
        return new HttpRequest(this);
    }
}
