package XMLReaderLaboratorio;

import java.util.HashMap;

public class Main {
    
    // DO A DTD VALIDATOR?
    public static void main(String[] args) {
        String XMLPath = "";
        if (args.length == 0)
            XMLPath = "XMLReaderLaboratorio/macchineLaboratorio.xml";
        else
            XMLPath = args[0];
        HashMap<Integer, Macchina> macchine = XMLReader.getMacchineFromXML(XMLPath, "XMLReaderLaboratorio/macchineLaboratorio.xsd");
        if (macchine == null) {    
            System.out.println("\nEsecuzione terminata.");
        } else {
            System.out.println("\nDocumento XML ben formato e valido!\n\nMacchine laboratorio: ");
            System.out.println("------");
            Macchina mostPerformant = null;
            for (Macchina m : macchine.values()) {
                System.out.println(m.toString());
                System.out.println("------");
                if (mostPerformant == null) {
                    mostPerformant = m;
                } else if (mostPerformant.getRam() < m.getRam()) {
                    mostPerformant = m;
                }
            }
            System.out.println("\nLa macchina con più ram è la macchina numero " + mostPerformant.getNumero());
        }
    }
}
