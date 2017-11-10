package com.crimson;

import javafx.application.Application;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import  javax.ws.rs.core.GenericEntity;

@Path("/wastebins")
public class Wastebin {


    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("lun")
    public String getIds(){
        List<String> myList = new ArrayList<String>();
        myList.add("Waqar");
        myList.add("Farooqi");
        return myList.toString();
    }

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getId(@QueryParam("id") String id){

        return id;
    }
}
