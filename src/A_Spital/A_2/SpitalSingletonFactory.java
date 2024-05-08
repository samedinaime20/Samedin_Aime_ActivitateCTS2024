package A_Spital.A_2;

public class SpitalSingletonFactory {
    private static SpitalSingletonFactory instanta = null;
    public SpitalSingletonFactory(){

    }

    public static synchronized SpitalSingletonFactory getInstanta(){
        if(instanta==null){
            instanta = new SpitalSingletonFactory();
        }
        return instanta;
    }
    public PersonalSpital createPersonal(TipPersonal tipPersonal) throws Exception
    {
        switch (tipPersonal){
            case brancardier:
                return new Brancardier();
            case asistent:
                return new Asistent();
            case medic:
                return new Medic();
            default :
                throw new Exception("Nu avem alata optiune");
        }
    }}
