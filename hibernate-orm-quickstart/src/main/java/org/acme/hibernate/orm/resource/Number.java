package org.acme.hibernate.orm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Path("/")
public class Number {

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("1")
    public String hello() throws IOException {
        String content = Files.readString(Paths.get("C:\\Users\\d4nyi\\OneDrive\\Рабочий стол\\quarkus-quickstarts\\hibernate-orm-quickstart\\src\\main\\resources\\META-INF\\resources\\index.html"), StandardCharsets.US_ASCII);
        return String.valueOf(content);
    }

}
