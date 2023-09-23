package XMLReaderLaboratorio;

public class Macchina {
    private String ip;
    private int numero;
    private String mac;
    private String processore;
    private String sistemaOperativo;
    private int ram;
    private String schedaGrafica;

    public Macchina(int numero, String ip, String mac, String processore, int ram, String sistemaOperativo, String schedaGrafica) {
        this.numero = numero;
        this.ip = ip;
        this.mac = mac;
        this.processore = processore;
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.schedaGrafica = schedaGrafica;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getProcessore() {
        return this.processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getschedaGrafica() {
        return this.schedaGrafica;
    }

    public void setschedaGrafica(String schedaGrafica) {
        this.schedaGrafica = schedaGrafica;
    }

    public String toString() {
        return "Numero macchina : " + Integer.toString(numero)
        + "\nIndirizzo IP : " + ip
        + "\nIndirizzo MAC : " + mac
        + "\nProcessore : " + processore
        + "\nMemoria RAM : " + Integer.toString(ram) + " gigabytes"
        + "\nScheda grafica : " + schedaGrafica
        + "\nSistema operativo : " + sistemaOperativo;
    }

}
