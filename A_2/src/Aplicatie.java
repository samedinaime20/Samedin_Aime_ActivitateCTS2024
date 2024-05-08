public class Aplicatie {
    public static void main(String[] args) {
        SpitalFactory personal1 = new SpitalFactory();
        PersonalSpital personalSpital = null;
        try {
            personalSpital = personal1.createPersonal(TipPersonal.asistent);
        } catch (Exception E) {
            E.printStackTrace();
        }
        personalSpital.descriere();

        SpitalFactory personal2 = new SpitalFactory();
        PersonalSpital personalSpital1 = null;
        try {
            personalSpital = personal2.createPersonal(TipPersonal.medic);
        } catch (Exception f) {
            f.printStackTrace();
        }
        personalSpital.descriere();

        SpitalFactory personal3 = new SpitalFactory();
        PersonalSpital personalSpital2 = null;
        try {
            personalSpital = personal3.createPersonal(TipPersonal.asistent);
        } catch (Exception m) {
            m.printStackTrace();
        }
        personalSpital.descriere();

        SpitalFactory personal4 = new SpitalFactory();
        PersonalSpital personalSpital3 = null;
        try {
            personalSpital=personal4.createPersonal(TipPersonal.asistent);
        }
        catch (Exception a){
            a.printStackTrace();
        }
        personalSpital.descriere();

        SpitalFactory personal5 = new SpitalFactory();
        PersonalSpital personalSpital4 = null;
        try {
            personalSpital=personal4.createPersonal(TipPersonal.medic);
        }
        catch (Exception b){
            b.printStackTrace();
        }
        personalSpital.descriere();

        SpitalFactory personal6 = new SpitalFactory();
        PersonalSpital personalSpital5 = null;
        try {
            personalSpital=personal6.createPersonal(TipPersonal.brancardier);
        }
        catch (Exception c){
            c.printStackTrace();
        }
        personalSpital.descriere();

        SpitalFactory spitalFactory = new SpitalFactory();
        PersonalSpital personalSpital6 = null;
        try {
            personalSpital6 = spitalFactory.createPersonal(TipPersonal.medic);
        }catch (Exception v){
            v.printStackTrace();
        }
        personalSpital6.descriere();
    }
    }