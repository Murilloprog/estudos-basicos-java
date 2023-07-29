package quartasemana.pilarespoo.Interface.projetoequipamento.estabelecimento;

import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.copiadora.Copiadora;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.digitalizadora.Digitalizadora;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.digitalizadora.Scanner;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.impressora.Deskjet;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.impressora.Impressora;
import quartasemana.pilarespoo.Interface.projetoequipamento.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = scanner;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
