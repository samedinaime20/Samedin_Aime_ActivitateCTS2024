package A_Spital.A_2;

public class SpitalFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal) throws Exception{
        switch (tipPersonal){
            case brancardier:
                return new Brancardier();
            case asistent:
                return new Asistent();
            case medic:
                return new Medic();
            default:
                throw new Exception("alt tip de personal nu exista");
        }
    }
}
