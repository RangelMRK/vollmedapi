package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;

public class ValidadorMotivoCancelamento implements ValidadorCancelamentoConsulta{

    @Override
    public void validar(DadosCancelamentoConsulta dados) {
        var motivo = dados.motivoCancelamento();
        if(motivo == null){
            throw new ValidacaoException("É obrigatório informar o motivo do cancelamento da consulta");
        }
    }
}
