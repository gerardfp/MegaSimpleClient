package com.github.gerardfp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NanoClient {
    public static String fetch(String url) {
        try {
            return HttpClient.newHttpClient().send(HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build(), HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
