package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokes.javaJokesClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    //step 3 connect the javalib and GCE
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        javaJokesClass obj = new javaJokesClass();
        MyBean response = new MyBean();
        response.setData(obj.getRandomJoke());
        return response;


    }

}
