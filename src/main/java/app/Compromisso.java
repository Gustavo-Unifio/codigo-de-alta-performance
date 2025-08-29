package app;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compromisso extends Atividade {
    private Calendar dataInicial;
    private Calendar dataFinal;

    @Override
    public String getDetalhes() {
        return this.getDescricao() + "(" + this.getDataInicial().getTime() + ")";
    }
}
