
package com.mycompany.testeestagiotargetsistemasfinal;

public class FaturamentoDistribuidora {
    private Double value = null;
    
    public FaturamentoDistribuidora() {}
    public FaturamentoDistribuidora(Double value) {
        this.value = value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    public Double getValue() {
        return value;
    }
    
}
