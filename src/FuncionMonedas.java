import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loperals.conversor.modelos.Moneda;
import com.loperals.conversor.modelos.MonedaAPI;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FuncionMonedas {


    public static void ConversionMonedas(String monedaDestino,String monedaOrigen,double valorConsulta, boolean estadoAplicacion) {
        // Invocacion de libreria de gson
        Gson gson= new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String apiKey="c09ae9ecda0fc7212727be4e";
        double resultado;
        double total;

        String direccion = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+monedaDestino+"/"+monedaOrigen;

        if (estadoAplicacion){
            try{
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());


                //Definicion del objeto en un registro
                MonedaAPI monedaRecord= gson.fromJson(response.body(),MonedaAPI.class);
                //System.out.println(monedaRecord);

                Moneda monedaObj=new Moneda(monedaRecord);
                resultado=valorConsulta/monedaObj.getValor();
                System.out.println(resultado);
                total=Math.round(resultado*1000.000)/1000.000;
                System.out.println("El valor en " + monedaDestino +" es: "+ total);




            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
