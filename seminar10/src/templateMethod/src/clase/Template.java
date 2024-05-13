package templateMethod.src.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    protected Map<String, Integer> stocuri;

    public Template(){
        this.stocuri= new HashMap<>();
        stocuri.put("Paracetamol",10);
        stocuri.put("Nurofen",15);
        stocuri.put("Teraflu",8);

    }
    protected abstract void primireReteta();
    protected abstract boolean verificareStoc();
    protected abstract void incaseaza();
    protected abstract void aducereMedicamente();
    protected abstract void emiteBon();
    protected abstract void respingeAchizitie();

    public final void cumparaMedicament(){
        primireReteta();
        if(verificareStoc()){
            aducereMedicamente();
            incaseaza();
            emiteBon();
        }else{
            respingeAchizitie();
        }
    }

}
