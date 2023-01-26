package com.jagrosh.jmusicbot.infra.client;

import com.jagrosh.jmusicbot.utils.JsonUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class CommonApiClient {
    public <T> T get(String requestURL, Class<T> returnType) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(requestURL);
            getRequest.addHeader("user-agent", "Mozilla/5.0");

            HttpResponse response = client.execute(getRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);

                return JsonUtil.fromJson(body, returnType);
            } else {
                System.out.println("response is error : " + response.getStatusLine().getStatusCode());
                return null;
            }

        } catch (Exception e){
            System.err.println(e);
            return null;
        }
    }

    public <T> T post(String requestURL, String jsonRequest, Class<T> returnType) {

        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost postRequest = new HttpPost(requestURL);
            postRequest.setHeader("Accept", "application/json");
            postRequest.setHeader("Connection", "keep-alive");
            postRequest.setHeader("Content-Type", "application/json");

            postRequest.setEntity(new StringEntity(jsonRequest));

            HttpResponse response = client.execute(postRequest);

            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);

                return JsonUtil.fromJson(body, returnType);
            } else {
                System.out.println("response is error : " + response.getStatusLine().getStatusCode());
                return null;
            }
        } catch (Exception e){
            System.err.println(e);
            return null;
        }
    }
}
