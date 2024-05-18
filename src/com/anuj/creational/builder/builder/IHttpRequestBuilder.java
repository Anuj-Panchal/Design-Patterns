package com.anuj.creational.builder.builder;

import com.anuj.creational.builder.IHttpRequest;

import java.util.Map;

public interface IHttpRequestBuilder {

    Map<String, String> getParams();

    Map<String, String> getHeaders();

    String getPayload();

    IHttpRequestBuilder addParam(String key, String value);

    IHttpRequestBuilder addParams(Map<String, String> params);

    IHttpRequestBuilder addHeader(String key, String value);

    IHttpRequestBuilder addHeaders(Map<String, String> headers);

    IHttpRequestBuilder addPayload(String payload);

    IHttpRequest build();
}
