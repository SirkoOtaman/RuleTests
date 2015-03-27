package com.testWeb;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

/**
 * Created by shychka on 3/26/2015.
 */
@Service
@ApplicationPath("rest")
public class GotoService extends Application {

}
