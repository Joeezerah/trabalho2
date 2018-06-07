
package controladores;

public class IniciaArray {
    
    public void Iniciar(){
        for (int i = 0; i < 20; i++) {
            questoes q = new questoes ();
        
        
        q.setid(i);
        q.setPergunta("");
        q.setA("");
        q.setB("");
        q.setC("");
        q.setD("");
        q.setResposta("");
               
        q.perguntas.add(q);
            
            
        }
    }
    
}
