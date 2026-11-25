package tn.sfax.calculatrice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calcul")
@Produces(MediaType.APPLICATION_JSON)
public class CalculRest {

    private final Calculatrice calculatrice = new Calculatrice();

    @GET
    @Path("/addition")
    public Operation addition(@QueryParam("a") double a,
                              @QueryParam("b") double b) {
        return new Operation(
                "addition", a, b, calculatrice.addition(a, b));
    }

    @GET
    @Path("/soustraction")
    public Operation soustraction(@QueryParam("a") double a,
                                  @QueryParam("b") double b) {
        return new Operation(
                "soustraction", a, b, calculatrice.soustraction(a, b));
    }

    @GET
    @Path("/multiplication")
    public Operation multiplication(@QueryParam("a") double a,
                                    @QueryParam("b") double b) {
        return new Operation(
                "multiplication", a, b, calculatrice.multiplication(a, b));
    }

    @GET
    @Path("/division")
    public Response division(@QueryParam("a") double a,
                             @QueryParam("b") double b) {
        if (b == 0) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("{\"erreur\":\"Division par zéro impossible\"}")
                    .type(MediaType.APPLICATION_JSON)
                    .build();
        }

        Operation operation = new Operation(
                "division", a, b, calculatrice.division(a, b));

        return Response.ok(operation).build();
    }
}