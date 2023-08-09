import java.util.HashMap;

public class RomeNumber {
    HashMap <String, Integer> rA = new HashMap<>(){{
        put("I",1); put("II",2); put("III",3); put("IV",4);
        put("V",5); put("VI",6); put("VII",7);
        put("VIII",8); put("IX",9); put("X",10);
        put("XX",20); put("XXX",30); put("XL",40);
        put("L",50); put("LX",60); put("LXX",70); put("LXXX",80);
        put("XC",90); put("C",100);
        
    }};

}
