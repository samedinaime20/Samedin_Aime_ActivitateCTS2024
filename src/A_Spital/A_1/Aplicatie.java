package A_Spital.A_1;

import A_Spital.A_1.OptiuniExtra;

public class Aplicatie {
    public static void main(String[] args) {
        OptiuniExtra oe = new OptiuniExtra();
        oe.setHasMicDejun(true);
        oe.setPatRabatabil(true);
        System.out.println(oe.toString());
    };

}
