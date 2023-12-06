package AgregacionComposicion;
public class _Address {
    private String block;
    private String city;
    private String region;
    private String country;
    public _Address(){
        this(null, null, null, null);
    }
    public _Address(String cal, String ciud, String reg, String pais){
        block= cal;
        city = ciud;
        region = reg;
        country = pais;
    }
    public String getBlock(){
        return block;
    }
    public String getCity(){
        return city;
    }
    public String getRegion(){
        return region;
    }
    public String getCountry(){
        return country;
    }
    public String toString(){
        return "Calle: "+getBlock()+"|Ciudad: "+getCity()+"|Region: "+getRegion()+"|Pais: "+getCountry();
    }
}
