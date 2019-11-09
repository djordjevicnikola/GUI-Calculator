package GUI;

public class Operacija {
        public static final String[] operacije = {"sabiranje", "oduzimanje", "mnozenje", "deljenje"};
        private String operacija;
        private double prviBroj;
        private double drugiBroj;

        public Operacija(String operacija, double prviBroj, double drugiBroj) {
            this.operacija = operacija;
            this.prviBroj = prviBroj;
            this.drugiBroj = drugiBroj;
        }

        public String getOperacija() {
            return operacija;
        }

        public void setOperacija(String operacija) {
            this.operacija = operacija;
        }

        public double getPrviBroj() {
            return prviBroj;
        }

        public void setPrviBroj(double prviBroj) {
            this.prviBroj = prviBroj;
        }

        public double getDrugiBroj() {
            return drugiBroj;
        }

        public void setDrugiBroj(double drugiBroj) {
            this.drugiBroj = drugiBroj;
        }

        public double izracunaj(){
            if("sabiranje".equals(operacija))return prviBroj + drugiBroj;
            else if("oduzimanje".equals(operacija))return prviBroj - drugiBroj;
            else if("mnozenje".equals(operacija))return prviBroj * drugiBroj;
            else if("deljenje".equals(operacija))return prviBroj / drugiBroj;
            return 0;
        }

}
