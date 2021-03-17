package br.com.agi.estruturas.estruturaEnvioMsg;

import br.com.agi.producer.interfaces.Dto;
import org.springframework.stereotype.Component;

/* OBJETIVO DA CLASSE É O ENVIO DE MENSAGENS
*   - PRIMEIRO TENTARÁ O ENVIO POR HTTP
*   - SEGUNDO, CASO O PRIMEIRO MÉTODO FALHE, FARÁ O ENVIO PARA FILA
* */
@Component
public abstract class EnviadorMessageTemplate {


    public void enviaPost(Dto dto) {
        try {
            enviaMsgPost(dto);
        } catch (Exception e) {
            sendMsgFromProducer(dto);
        }
    }

    public void enviaGet(Dto dto) {
        try {
            enviaMsgGet(dto);
        } catch (Exception e) {
            sendMsgFromProducer(dto);
        }
    }


    protected abstract void enviaMsgPost(Dto dto);

    protected abstract void enviaMsgGet(Dto dto);

    protected abstract void sendMsgFromProducer(Dto dto);
}
