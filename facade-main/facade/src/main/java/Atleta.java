/*
SIMULANDO UM SISTEMA PARA O DEPARTAMENTO MÉDICO DE UMA EQUIPE DE ESPORTES
ONDE UM ATLETA É SUBMETIDO A UMA SERIE DE EXAMES PARA SABER SE SERÁ OU NÃO
CONTRATADO PELA EQUIPE
 */

import java.text.Normalizer;
public class Atleta {
    public boolean contratar() {
        return AtletaFacade.verificarExamesMedicos(this);
    }
}