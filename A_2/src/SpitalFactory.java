public class SpitalFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal) throws Exception{
        switch (tipPersonal){
            case TipPersonal.brancardier:
                return new Brancardier();
            case TipPersonal.asistent:
                return new Asistent();
            case TipPersonal.medic:
                return new Medic();
            default:
                throw new Exception("alt tip de personal nu exista");
        }
    }
}
