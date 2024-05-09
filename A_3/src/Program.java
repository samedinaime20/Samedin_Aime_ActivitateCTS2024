public class Program {
    private static void afisare(Factory creaza){
        PersonalSpital personalSpital= creaza.createPersonal();
        personalSpital.descriere();
    }
    public static void main(String[] args){
        afisare(new FactoryAsistent());
        afisare(new FactoryBrancardier());
        afisare(new FactoryMedic());
        afisare(new FactoryMedic());
        afisare(new FactoryBrancardier());
        afisare(new FactoryAsistent());
    }
}
