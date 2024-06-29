package org.nakul;

import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    private Map<String, String> urlMap;
    private Map<String, String> reverseUrlMap; // To handle reverse lookup
    private String domain;
    private int counter;

    public URLShortener() {
        urlMap = new HashMap<>();
        reverseUrlMap = new HashMap<>();
        domain = "http://short.url/";
        counter = 1;
    }

    public String shortenURL(String longURL) {
        if (reverseUrlMap.containsKey(longURL)) {
            // If the long URL is already shortened, return the existing short URL
            return reverseUrlMap.get(longURL);
        }

        String shortURL = domain + Integer.toHexString(counter++);
        urlMap.put(shortURL, longURL);
        reverseUrlMap.put(longURL, shortURL);

        return shortURL;
    }

    public String expandURL(String shortURL) {
        return urlMap.getOrDefault(shortURL, "URL not found");
    }
}
