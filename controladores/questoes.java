
package controladores;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class questoes {
    
    private int id ;
    private String pergunta;
    private String a;
    private String b;
    private String c;
    private String d;
    private String resposta;
    
    public static ArrayList<questoes> perguntas = new ArrayList<>();

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public static ArrayList<questoes> getPerguntas() {
        return perguntas;
    }

    public static void setPerguntas(ArrayList<questoes> perguntas) {
        questoes.perguntas = perguntas;
    }

    public void setA(JTextArea Teste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}
