package com.hbs.simplespring.beans.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by bingsenh on 2019/9/5.
 */
public class UrlResource implements Resource {
    private final URL url;

    public UrlResource(URL url){this.url = url;}
    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
