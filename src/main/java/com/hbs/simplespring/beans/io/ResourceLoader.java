package com.hbs.simplespring.beans.io;

import java.net.URL;

/**
 * Created by bingsenh on 2019/9/5.
 */
public class ResourceLoader {
    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
