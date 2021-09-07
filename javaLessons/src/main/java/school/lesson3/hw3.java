package school.lesson3;

public class hw3 {

    class sotrudnik {
        private String familiya;
        private String imya;
        private String otchestvo;
        private String email;
        private int zarplata;
        private int vozrast;
        private String dolzhnost;
        private String telephone;

        public sotrudnik(String familiya, String imya, String otchestvo, String email,
                         int zarplata, int vozrast, String dolzhnost, String telephone) {
            this.familiya = familiya;
            this.imya = imya;
            this.otchestvo = otchestvo;
            this.email = email;
            this.zarplata = zarplata;
            this.vozrast = vozrast;
            this.dolzhnost = dolzhnost;
            this.telephone = telephone;
        }

        public static void main(String[] args) {
            sotrudnik[] sst = new sotrudnik[5];
            sst[0] = new sotrudnik("ivanov", "ivan", "ivanovich", "rtt1@mail.ru",
                    50000, 44, "s1", "22222");
            sst[1] = new sotrudnik("artemov", "artem", "ivanovich", "rt2t@mail.ru",
                    20000, 44, "j2", "22222");
            sst[2] = new sotrudnik("vadimov", "vadim", "ivanovich", "r33tt@mail.ru",
                    20000, 44, "j2", "22222");
            sst[3] = new sotrudnik("lukov", "luk", "ivanovich", "r2tt@mail.ru",
                    60000, 33, "s2", "22222");
            sst[4] = new sotrudnik("antonov", "anton", "ivanovich", "r12tt@mail.ru",
                    44000, 22, "m3", "22222");
            for (int i = 0; i < sst.length; i++)
            {
                System.out.println("imya " + sst[i].imya);
            }


        }
    }
}
