import java.util.ArrayList;
import java.util.List;
public abstract class DM {
    private List<Atleta> atletasReprovados = new ArrayList<Atleta>();

    public void addAtletaReprovado(Atleta atleta) {
        this.atletasReprovados.add(atleta);
    }

    public boolean verificarAtletaReprovado(Atleta atleta) {
        return this.atletasReprovados.contains(atleta);
    }
}