import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Temperature {
    private double value;
    private char simbol;

    public Temperature() {
        this.value = 0;
        this.simbol = 'F';
    }
    public Temperature(double value) {
        this.value = value;
        this.simbol = 'C';
    }
    public Temperature(char simbol) {
        this.value = 0.0;
        this.simbol = simbol;
    }
    public Temperature(double value, char simbol) {
        this.value = value;
        this.simbol = simbol;
    }

    public double getCelcius(){
        return 5*(value-32)/9;
    }
    public double getFahrenheit(){
        return 9*(value/5)+32;
    }
    public void setValue(double value){
        this.value = value;
    }
    public void setSimbol(char simbol){
        this.simbol = simbol;
    }
    public void setBoth(double value, char simbol){
        this.value = value;
        this.simbol = simbol;
    }

    @Override
    public String toString() {
        return "Temperature{" + "value=" + value + ", simbol=" + simbol + '}';
    }

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(100.0);
        Temperature temp3 = new Temperature('F');
        Temperature temp4 = new Temperature(32.0,'F');

        System.out.println("temp1 " + temp1);
        System.out.println("temp2 " + temp2);
        System.out.println("temp3 " + temp3);
        System.out.println("temp4 " + temp4);

        System.out.println("temp4 в (С): " + temp4.getCelcius());
        System.out.println("temp2 в (F): " + temp2.getFahrenheit());

        temp1.setBoth(64,'C');
        System.out.println("temp1 изменение: " + temp1);
        System.out.println("temp1 в (F): " + temp1.getFahrenheit());
    }
}
