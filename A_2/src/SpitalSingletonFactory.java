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
            case TipPersonal.brancardier:
                return new Brancardier();
            case TipPersonal.asistent:
                return new Asistent();
            case TipPersonal.medic:
                return new Medic();
            default :
                throw new Exception("Nu avem alata optiune");
        }
    }}
