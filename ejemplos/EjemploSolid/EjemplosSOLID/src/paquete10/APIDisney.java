package paquete10;

public class APIDisney implements APIMovie{
    private String apiKey;

    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"909090";
    }

    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
}
