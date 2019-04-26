package com.example.servlet;

import org.apache.axis.transport.http.AxisServlet;

/**
 * @author donghongchen
 * @create 2017-05-08 10:10
 **/

@javax.servlet.annotation.WebServlet(
        urlPatterns =  "/services/*",
        loadOnStartup = 1,
        name = "AxisServlet"
)
public class WebServlet extends AxisServlet {


}
