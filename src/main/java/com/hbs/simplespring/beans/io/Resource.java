package com.hbs.simplespring.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by bingsenh on 2019/9/5.
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
