package quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.multifuncional;

import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.copiadora.Copiadora;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.digitalizadora.Digitalizadora;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.impressora.Impressora;

//eu imprimo copio e digitalizo

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }

    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");
        }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }
    
}
